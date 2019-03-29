package lcwu;

import java.util.*;

public class Solution268 {
    public int missingNumber(int[] nums) {
        List a = new ArrayList();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            a.add(nums[i]);
        }
        for(int i =0;i<nums.length+1;i++){
            if(!a.contains(i)) return i;
        }
        return 0;
    }
}
