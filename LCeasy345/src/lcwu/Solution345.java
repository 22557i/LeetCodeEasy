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
