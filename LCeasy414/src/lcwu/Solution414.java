package lcwu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution414 {
    public int thirdMax(int[] nums) {
        Set<Integer> numset = new HashSet<Integer>();
        for (int i = 0; i <nums.length ; i++) {
            if(!numset.contains(nums[i]))numset.add(nums[i]);
            else nums[i]=0;
        }
        Arrays.sort(nums);
        if(numset.size()<3)return nums[nums.length-1];
        else return nums[nums.length-3];

    }
}
