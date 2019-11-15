/**
 * Created by Hao Wu on 11/12/19.
 */
public class Solution243 {
    public int shortestDistance(String[] words, String word1, String word2) {
        int p1=-1;
        int p2 = -1;
        int res=words.length;
        for(int i=0;i<words.length;i++){
            if(words[i].equals(word1))p1 = i;
            if(words[i].equals(word2))p2 = i;

            if(p1!=-1&&p2!=-1)res = Math.min(res,Math.abs(p2-p1));
        }
        return res ;
    }
}
