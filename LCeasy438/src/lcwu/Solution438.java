package lcwu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution438 {

    public List<Integer> findAnagrams(String s ,String p){
        ArrayList<Integer> res = new ArrayList<>();
        if(s.equals(p)) {
            res.add(0);
            return res;
        }

        ArrayList<String> sStringlist = new ArrayList<>();
        for (int i = 0; i <s.length()-p.length()+1; i++) {
            String temp = s.substring(i,i+p.length());

            sStringlist.add(sortString(temp));
        }
        for (int i = 0; i <sStringlist.size() ; i++) {
            if(sortString(p).equals(sStringlist.get(i)))res.add(i);
        }
        return res;
    }
    public String sortString (String s){

        char[] tempchar = s.toCharArray();
        Arrays.sort(tempchar);
        StringBuffer s1 = new StringBuffer();
        for(Character a: tempchar){
            s1.append(a);
        }

        return s1.toString();
    }

    public static void main(String[] args) {
        String s1 = "cbcbca";
        Solution438 s438 = new Solution438();
        System.out.println(s438.sortString(s1));
    }
}/* public List<Integer> findAnagrams(String s, String p) {
        int[] counts = new int[128];                            // Total counts for chars needed
        for (char c : p.toCharArray()) counts[c]++;
        int n = s.length(), m = p.length(), total = m;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (counts[s.charAt(i)]-- > 0) total--;             // 1. Add right border
            if (i >= m - 1) {
                if (total == 0) result.add(i - m + 1);          // 2. Update Result
                if (++counts[s.charAt(i - m + 1)] > 0) total++; // 3. Remove left border
            }
        }
        return result;
    }*/