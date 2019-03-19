package lcwu;

public class Solution70 {
    public int climbStairs(int n) {
    int count =0;
    int count1=n;
    int count2=0;

        for(int i =(n+2)/2;i>0;i-=2) {
            if (count1 >= count2) {
                count += (factorial(count1+1) / factorial(count2) / factorial(count1+1-count2));

            }else
                count+=(factorial(count2+1)/factorial(count1)/factorial(count2+1-count1));

            count1-=2;
            count2++;
        }



        return count;
    }
    public int factorial(int n){
            int r = 1;
            for(int i = n;i > 0;i--){
                r *= i;
            }
            return r;
    }

}
