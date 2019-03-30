package lcwu;

import java.util.HashMap;
import java.util.Map;

public class Solution290 {
    public boolean wordPattern(String pattern, String str){
        String[] strs = str.split(" ");
        if(strs.length!=pattern.length())return false;
        Map<Character,String>mapping = new HashMap<>();
        for (int i = 0; i <pattern.length() ; i++) {
            if(!mapping.containsKey(pattern.charAt(i))&&!mapping.containsValue(strs[i]))
            mapping.put(pattern.charAt(i),strs[i]);
        }
        for(int i=0;i<pattern.length();i++){
            if(!strs[i].equals(mapping.get(pattern.charAt(i))))return false;
        }
        return true;
    }
}
