import java.util.Stack;

/**
 * Created by Hao Wu on 11/12/19.
 */
public class Solution1047 {
    public String removeDuplicates(String S) {
        if(S.length()==0||S==null)return "";
        char[] set = S.toCharArray();
        Stack<Character>stack = new Stack<>();
        stack.push(set[0]);
        for(int i=1;i<set.length;++i){
            if(!stack.isEmpty()&&set[i]==stack.peek())stack.pop();
            else if(stack.isEmpty()||stack.peek()!=set[i])stack.push(set[i]);
        }
        String res = "";
        while(!stack.isEmpty())res = stack.pop()+res;
        return res;
    }
}
