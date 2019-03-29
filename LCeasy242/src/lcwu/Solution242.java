package lcwu;

import java.util.HashSet;
import java.util.*;

public class Solution242 {

    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        char [] a = s.toCharArray();
        char [] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
}
