package lcwu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution53 {
    public int maxSubArray(int[] nums) {
       if(nums.length==0)return 0;

       int max =nums[0];
       for(int i =0;i<nums.length-1;i++){
           if(nums[i]>0) nums[i+1]+= nums[i];
           max = Math.max(max,nums[i+1]);
       }
       return max;
    }
}
/*
*  int sum=0;

        List<Integer> a = new ArrayList<>();
        for(int j=0;j<nums.length;j++)a.add(nums[j]);
        for(int i =0;i<nums.length;i++){
            sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
               a.add(sum);
            }
        }

        Collections.sort(a);

        return a.get(a.size()-1);*/