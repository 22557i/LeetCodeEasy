package lcwu;

import static java.lang.StrictMath.sqrt;

public class Solution441 {
    public int arrangeCoins(int n){
        int res=(int)(Math.sqrt(n)*Math.sqrt(2));
        return (res%2!=0)?(res*((res+1)/2)>n?res-1:res):res/2*(res+1)>n?res-1:res;
    }
}
