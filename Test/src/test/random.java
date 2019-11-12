package test;

import java.util.ArrayList;

/**
 * Created by Hao Wu on 10/9/19.
 */
public class random {
    public static void main(String  s  []) {
        ArrayList<Integer>result = new ArrayList<>();
        int nums[]={2,8,3,6,1,10,5,7,4,3};
        int copy[] = nums;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]%2==1){
                result.add(copy[i]);
                nums[i]++;
                break;
            }
        }
        for (int i:result){
            System.out.println(i);
        }
    }
}
