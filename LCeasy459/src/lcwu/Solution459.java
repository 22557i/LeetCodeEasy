package lcwu;

public class Solution459 {
    public boolean repeatedSubstringPattern(String s) {
        if(s.length()==1)return false;
        if(s.length()==2&&s.charAt(0)==(s.charAt(1)))return true;
        return (s + s).substring(1, s.length() * 2 - 2).indexOf(s)!=-1;
    }

}
