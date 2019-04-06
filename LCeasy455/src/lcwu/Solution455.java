package lcwu;

import java.util.*;
public class Solution455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        while(i < g.length && j < s.length) {
            if(s[j] - g[i]>=0) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i;
    }
}
