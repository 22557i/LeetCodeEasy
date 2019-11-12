package assignment2;
/**
 * 
 * author : Hao Wu
 */
import java.util.Stack;

public class Requirement5 {
	static Stack<Character> op = new Stack<>();
	 public static String getrp(String s){
         char[] arr = s.toCharArray();
         int len = arr.length;
         String out = "";
 
         for(int i = 0; i < len; i++){
             char ch = arr[i];
             if(ch == ' ') continue;
 
             if((ch >= '0' && ch <= '9')||(ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')) {
                 out+=ch;
                 continue;
             }
             if(ch == '(') op.push(ch);

             if(ch == '+' || ch == '-'){
                 while(!op.empty() && (op.peek() != '(')) 
                     out+=op.pop();
                 op.push(ch);
                 continue;
             }

             if(ch == '*' || ch == '/'){
                 while(!op.empty() && (op.peek() == '*' || op.peek() == '/')) 
                     out+=op.pop();
                 op.push(ch);
                 continue;
             }
             if(ch == ')'){
                 while(!op.empty() && op.peek() != '(') 
                     out += op.pop();
                 op.pop();
                 continue;
             }
         }
         while(!op.empty()) out += op.pop();
         return out;
    }
	 
	 public static void main(String args[]) {
		 String s1 = "(A+B)*C+D/(E+F*G)-H";
		 String s2 = "(300+23)*(43-21)/(84+7)";
		 String s3 = "(4+8)*(6+5)/((3-2)*(2+2))";
		 System.out.println(getrp(s1));
		 System.out.println(getrp(s2));
		 System.out.println(getrp(s3));
	 }
}
