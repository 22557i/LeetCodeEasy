package HUAWEI1223;

import java.util.Stack;

public class Q2 {
    public static void main(String[] args) {
        System.out.println(repairPara("[{]["));
    }
    public static String repairPara(String s){
        String res = "";

        char[] sc = s.toCharArray();

        Stack<Character>stack = new Stack<>();

        for(int i =0;i<sc.length ;i++){
            if(sc[i]=='{'||sc[i]=='[')stack.push(sc[i]);
            else{
                if(sc[i]==']'){
                    if(stack.peek()=='['){
                        res= stack.pop()+res+sc[i];
                    }else{
                        res= stack.pop()+res+'}';
                        i--;
                    }
                }else{
                    if(stack.peek()=='{'){
                        res= stack.pop()+res+sc[i];
                    }else{
                        res= stack.pop()+res+']';
                        i--;
                    }
                }
            }

        }
        while (!stack.isEmpty()){
            if(stack.peek()=='['){
                res =  stack.pop()+res+']';
            }else  res =  stack.pop()+res+'}';
        }
        return res;
    }
}
