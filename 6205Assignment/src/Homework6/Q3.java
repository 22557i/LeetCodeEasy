package Homework6;

/**
 * Created by Hao Wu on 10/14/19.
 */
public class Q3 {
    static String s = "ABDCEDDFCABBEECCEFDDAAF";

    public static void main(String[] args) {
        int map[] = new int[26];
        for(char c:s.toCharArray())
            map[c-'A']++;
        StringBuffer res = new StringBuffer();
        for (int i = 0; i <map.length ; i++) {
            while (map[i]>0){
                res.append((char)(i+'A'));
                map[i]--;
            }

        }
        System.out.println(res.toString());

    }
}
