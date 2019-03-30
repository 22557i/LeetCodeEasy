package lcwu;

public class Solution342 {
    public boolean isPowerOfFour(int num) {
        /*if(num==0)return false;
        if(num==1)return true;
        if(num%4 != 0)return false;
        return isPowerOfFour(num/4);
        */
        if(num<1)return false;
        while(num%4==0)num/=4;
        return num==1;
    }
}
