/**
 * Created by Hao Wu on 11/26/19.
 */
public class Solution1165 {
    public int calculateTime(String keyboard, String word) {
        int map[] = new int[26];
        for(int i=0;i<keyboard.length();++i){
            map[keyboard.charAt(i)-'a'] = i;
        }
        int res =map[word.charAt(0)-'a'];
        for(int i=1;i<word.length();++i)
            res+=Math.abs(map[word.charAt(i)-'a']-map[word.charAt(i-1)-'a']);
        return res;
    }
}
