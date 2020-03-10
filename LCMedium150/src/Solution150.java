import java.util.Stack;

public class Solution150 {
    public int evalRPN(String[] tokens) {
        Stack<String>s = new Stack<>();
        for (String t: tokens) {
            switch (t){
                case "+":{
                    int n2 = Integer.parseInt(s.pop());
                    int n1 = Integer.parseInt(s.pop());
                    s.push(n1+n2+"");
                    break;
                }
                case "-":{
                    int n2 = Integer.parseInt(s.pop());
                    int n1 = Integer.parseInt(s.pop());
                    s.push(n1-n2+"");
                    break;
                }
                case "/":{
                    int n2 = Integer.parseInt(s.pop());
                    int n1 = Integer.parseInt(s.pop());
                    s.push(n1/n2+"");
                    break;
                }
                case "*":{
                    int n2 = Integer.parseInt(s.pop());
                    int n1 = Integer.parseInt(s.pop());
                    s.push(n1*n2+"");
                    break;
                }
                default:{
                    s.push(t);
                }
            }
        }
        return Integer.valueOf(s.pop());
    }
}
