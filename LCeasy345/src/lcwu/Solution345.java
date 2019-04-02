package lcwu;

import java.util.ArrayList;
import java.util.Stack;

public class Solution345 {
    public String reverseVowels(String s) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<Character>stackdata = new Stack<>();

        char[] schars = s.toCharArray();
        for (int i = 0; i <schars.length ; i++) {
            if(schars[i]=='a'||schars[i]=='e'||schars[i]=='i'||schars[i]=='o'||schars[i]=='u')
            {
                stackdata.push(schars[i]);
                arrayList.add(i);
            }
        }
        for (int j = 0; j <arrayList.size() ; j++) {
            schars[arrayList.get(j)]=stackdata.pop();
        }
        StringBuffer res = new StringBuffer();
        for (int i = 0; i <schars.length ; i++) {
            res.append(schars[i]);
        }
        return res.toString();
    }
}
/*
* if (s == null || s.length() ==0) return s;
        char[] chars = s.toCharArray();
        int i = 0, j= s.length() - 1;
        while (i < j) {
            char c1 = chars[i];
            char c2 = chars[j];
            boolean b1 = isVowel(c1);
            boolean b2 = isVowel(c2);
            if (b1 && b2 ) {
                chars[i] = chars[j];
                chars[j] = c1;
                i++; j--;
            }
            else if (b1) j--;
            else i++;
        }
        return String.valueOf(chars);
    }
    private static boolean isVowel(char c) {
        return (c =='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
        c =='A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
*/