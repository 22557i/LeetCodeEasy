package lcwu;

import java.util.*;
public class Solution219 {
    public boolean containNearbyDuplicate(int []nums,int k){

        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        Integer prev;
        for (int i = 0; i < nums.length; i++) {
            prev = m.put(nums[i], i);
            if (prev != null && i - prev <= k) return true;
        }
        return false;
    }
    }

