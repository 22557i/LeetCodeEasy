import java.util.HashSet;
import java.util.Set;

/**
 * Created by Hao Wu on 12/1/19.
 */
public class Solution299 {
    public String getHint(String secret, String guess) {
        int r1=0,r2=0;
        Set<Character>set = new HashSet<>();
        for(char c:secret.toCharArray())set.add(c);
        for(int i=0;i<secret.length();++i){
            if(secret.charAt(i)==guess.charAt(i)){
                r1++;
                continue;
            }
            if(set.contains(guess.charAt(i)))r2++;
        }
        return new StringBuffer().append(r1).append('A').append(r2).append('B').toString();
    }

    public static void main(String[] args) {
        Solution299 s= new Solution299();
        System.out.println(s.getHint("1234","1432"));
    }
}
