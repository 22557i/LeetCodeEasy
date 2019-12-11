package WeeklyContest1207;

import java.util.Arrays;

/**
 * Created by Hao Wu on 12/7/19.
 */
public class Q1 {
    public int subtractProductAndSum(int n) {
        int nums[] = new int[Integer.toString(n).length()];

        int res=1;
        for(int i=0;i<nums.length;i++){
            nums[i] = n%10;
            res*=nums[i];
            n/=10;
        }
        return res - Arrays.stream(nums).sum();

    }

    public static void main(String[] args) {
        Q1 q = new Q1();
        System.out.println(q.subtractProductAndSum(234));
        System.out.println(q.subtractProductAndSum(4421));
    }
}
