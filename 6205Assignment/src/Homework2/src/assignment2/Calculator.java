package Homework2.src.assignment2;
import java.util.Stack;
 
 /**
  * calculator
  * author : Hao Wu
  */
 public class Calculator {

 
     private Stack<Long> numberStack = null;
     private Stack<Character> symbolStack = null;

     public long caculate(String numStr) {
         numStr = removeStrSpace(numStr); 
         if (numStr.length() > 1 && !"=".equals(numStr.charAt(numStr.length() - 1) + "")) {
             numStr += "=";
         }
         if (!isStandard(numStr)) {
             System.err.println("Error Wrong Math expression!");
            return 0;
         }
         // instantiate Stack for numbers and symbol
         numberStack = new Stack<Long>();
         symbolStack = new Stack<Character>();
         StringBuffer temp = new StringBuffer();
         for (int i = 0; i < numStr.length(); i++) {
             char ch = numStr.charAt(i); 
             if (isNumber(ch)) { 
                 temp.append(ch);
             } else { 
                 String tempStr = temp.toString(); 
                 if (!tempStr.isEmpty()) {
                     long num = Long.parseLong(tempStr); 
                     numberStack.push(num); 
                     temp = new StringBuffer(); 
                 }
      
                 while (!comparePri(ch) && !symbolStack.empty()) {
                     long b = numberStack.pop(); 
                     long a = numberStack.pop();
                 
                     switch ((char) symbolStack.pop()) {
                     case '+':
                         numberStack.push(a + b);
                         break;
                     case '-':
                         numberStack.push(a - b);
                        break;
                     case '*':
                         numberStack.push(a * b);
                         break;
                     case '/':
                         numberStack.push(a / b);
                        break;
                     default:
                         break;
                     }
                 }
                 if (ch != '=') {
                     symbolStack.push(new Character(ch)); 
                     if (ch == ')') { 
                         symbolStack.pop();
                         symbolStack.pop();
                     }
                 }
             }
         } 
 
         return numberStack.pop(); 
   }
 
     private String removeStrSpace(String str) {
         return str != null ? str.replaceAll(" ", "") : "";
   }
 
     
     private boolean isStandard(String numStr) {
         if (numStr == null || numStr.isEmpty()) 
            return false;
        Stack<Character> stack = new Stack<Character>(); 
        boolean b = false; 
         for (int i = 0; i < numStr.length(); i++) {
             char n = numStr.charAt(i);
            
             if (!(isNumber(n) || "(".equals(n + "") || ")".equals(n + "")
                     || "+".equals(n + "") || "-".equals(n + "")
                     || "*".equals(n + "") || "/".equals(n + "")
                     || "=".equals(n + ""))) {
                 return false;
             }
             if ("(".equals(n + "")) {
                 stack.push(n);
             }
             if (")".equals(n + "")) { 
                 if (stack.isEmpty() || !"(".equals((char) stack.pop() + "")) // �����Ƿ�ƥ��
                     return false;
             }
   
             if ("=".equals(n + "")) {
                 if (b)
                     return false;
                 b = true;
             }
         }

         if (!stack.isEmpty())
             return false;

         if (!("=".equals(numStr.charAt(numStr.length() - 1) + "")))
             return false;
         return true;
     }
 
     private boolean isNumber(char num) {
         if (num >= '0' && num <= '9')
             return true;
       return false;
     }

  
     private boolean comparePri(char symbol) {
         if (symbolStack.empty()) { 
             return true;
         }
 
         char top = (char) symbolStack.peek(); // �鿴��ջ�����Ķ���ע�ⲻ�ǳ�ջ
         if (top == '(') {
             return true;
         }
 
         switch (symbol) { 
         case '(': 
             return true;
         case '*': {
             if (top == '+' || top == '-') // ���ȼ���+��-��
                 return true;
             else
                return false;
         }
         case '/': {
             if (top == '+' || top == '-') // ���ȼ���+��-��
                 return true;
             else
                 return false;
         }
         case '+':
             return false;
         case '-':
             return false;
         case ')': 
             return false;
         case '=': 
             return false;
        default:
             break;
         }
         return true;
     }
 
     public static void main(String args[]) {
         String s1 = "(300+23)*(43-21)/(84+7)"; // 
         String s2 = "(4+8)*(6+5)/((3-2)*(2+2))";
         Calculator cal = new Calculator();
         long result = cal.caculate(s1); // 
         System.out.println(result);
         long result1 = cal.caculate(s2); // 
         System.out.println(result1);
  }
         
     
 }