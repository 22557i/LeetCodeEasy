package lcwu;

public class Solution258 {
    public int addDigits(int num) {
        String s = String.valueOf(num);
        int count=0;
     for(int i =0;i<s.length();i++){
         count+= Integer.valueOf(s.substring(i,i+1));
     }
        if(count%10==count)return count;
        else return addDigits(count);
    }
}
