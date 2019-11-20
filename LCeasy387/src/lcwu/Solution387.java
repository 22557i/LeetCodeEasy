package lcwu;
import java.util.*;
public class Solution387 {
    public static int firstUniqChar(String s) {
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

    public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "loveleetcode";
        String s3 = "qqqqqqqwertyuiopp";
        String s4 = "qqqqqqqqqqqqqqqqe";
        String s5 = "aaaaaaa";
        System.out.println(firstUniqChar(s1));
        System.out.println(firstUniqChar(s2));
        System.out.println(firstUniqChar(s3));
        System.out.println(firstUniqChar(s4));
        System.out.println(firstUniqChar(s5));
        List<String>l = new ArrayList<>();
        l.add("abv");
        l.add("cba");
        l.stream().filter(s->s.startsWith("a")).forEach(System.out::println);
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

