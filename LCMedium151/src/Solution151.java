/**
 * Created by Hao Wu on 10/23/19.
 */
public class Solution151 {
    public String reverseWords(String s) {
        s= s.trim();
        String temp[] = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = temp.length-1; i >-1 ; --i) {
            if(!temp[i].equals("")){
                sb.append(temp[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = "a good   example";
        Solution151 solution151 = new Solution151();
        String t = solution151.reverseWords(s);
    }
}
