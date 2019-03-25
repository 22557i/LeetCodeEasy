package lcwu;

import java.util.HashMap;
import java.util.*;

public class Solution205 {
    public boolean isIsomorphic(String s, String t){
        if(s.length()==0) return true;
        Map a = new HashMap();
        for(int i =0;i<s.length();i++) {
            if (a.put(s.charAt(i),i)!=a.put(t.charAt(i)+"",i))return false;
        }
        return true;

    }
}
/*
* Map<Character, Character> map = new HashMap();
        if(s.length() != t.length()) return false;
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        for(int i =0; i<ss.length; i++){
            if(!map.containsKey(ss[i])) {
                if(map.containsValue(tt[i])) {
                    return false;
                }
                map.put(ss[i], tt[i]);
            } else {
                if(!map.get(ss[i]).equals(tt[i])) {
                    return false;
                }
            }
        }
        return true;*/
