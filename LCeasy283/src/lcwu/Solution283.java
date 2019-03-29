package lcwu;

import java.util.Arrays;

public class Solution283 {
    public void moveZeroes(int[] nums) {
        int count =0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]==0){
                count++;
                for(int j =i;j<nums.length;j++){
                    nums[j]=nums[i+1];
                }
            }
        }
        for(int k = nums.length-count-1;k<nums.length;k++){
            nums[k]=0;
        }



    }

}
