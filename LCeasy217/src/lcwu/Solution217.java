package lcwu;

import java.util.HashSet;
import java.util.Set;

public class Solution217 {
    public boolean containsDuplicate(int []nums){
        if(nums.length==0||nums.length==1)return false;
        Set numsset=new HashSet<>();

        for(int i =0;i<nums.length;i++){
            if(numsset.contains(nums[i])) return true;
            numsset.add(nums[i]);
        }
        return false;
    }
}
