package lcwu;

public class Solution171 {
    public int titleToNumber(String s) {
    int count =0;
        for(int i =s.length()-1;i>-1;i--){
            count += (s.charAt(i)-64) * Math.pow(26,s.length()-1-i);
        }
        return count;
    }
}
