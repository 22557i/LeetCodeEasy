package lcwu;

import java.util.*;

public class Solution169 {
    public int majorityElement(int[] nums) {
        TreeMap<Integer,Integer> a = new TreeMap<>();

        for(int i =0;i<nums.length;i++){
            if(a.get(nums[i])==null) a.put(nums[i],1);
            else a.put(nums[i],a.get(nums[i])+1);
        }

        for(Map.Entry entry:a.entrySet()){
            if(Integer.valueOf(entry.getValue().toString()) > nums.length/2) return Integer.valueOf(entry.getKey().toString()).intValue();
        }
       return 0;
    }
}
