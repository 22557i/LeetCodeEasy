package lcwu;

import java.util.ArrayList;
import java.util.List;

public class Solution58 {

    public int lengthOfLastWord(String s) {
        List<Integer> a = new ArrayList<>();
        char []b = new char[s.length()];
        for(int i =0;i<s.length();i++){
            b[i]=s.charAt(i);
            if(b[i]==' ') a.add(i);
        }
        if(a.size()==0)return 0;
        if(a.size()==1){
            if(a.get(0)==s.length()-1)return s.length()-1;
            else return s.length()-1-a.get(0);
        }else return a.get(a.size()-1)-a.get(a.size()-2);
    }
}
