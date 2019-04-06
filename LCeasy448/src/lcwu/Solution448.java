package lcwu;

import java.util.*;

public class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        HashSet set = new HashSet();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i =1;i<=nums.length;i++){
            if(!set.contains(i))res.add(i);
        }
        return res;
    }
}
