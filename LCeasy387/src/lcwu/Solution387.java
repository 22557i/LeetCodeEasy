package lcwu;
import java.util.*;
public class Solution387 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
//    public int firstUniqChar(String s) {
//        int [] result=new int[26];
//        for(int i=0;i<s.length();i++){
//            result[s.charAt(i)-'a']++;
//        }
//        for(int j=0;j<s.length();j++)
//        {
//            if(result[s.charAt(j)-'a']==1) return j;
//        }
//        return -1;
//
//    }

