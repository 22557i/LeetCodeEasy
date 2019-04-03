package lcwu;

import java.util.Arrays;
import java.util.Collections;

public class Solution389 {
    public char findTheDifference(String s , String t){
      char a[] = s.toCharArray();
      char b[] = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        for(int i=0;i<s.length();i++){
            if(a[i]!=b[i])return b[i];
        }
        return b[s.length()];
    }
}
