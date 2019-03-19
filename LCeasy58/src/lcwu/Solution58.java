package lcwu;

import java.util.ArrayList;
import java.util.List;

public class Solution58 {

    public int lengthOfLastWord(String s) {
        int len = 0, i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ')i--;
        while (i >= 0 && s.charAt(i)!= ' ') {
            len++;
            i--;
        }
        return len;
    }
}
