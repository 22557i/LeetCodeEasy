package lcwu;

import java.util.*;

public class Solution283 {
    public void moveZeroes(int[] nums) {
       ArrayList arrayList = new ArrayList();
       for(int i =0;i<nums.length;i++){
           if(nums[i]!=0) arrayList.add((int)nums[i]);
       }
        for(int i =0;i<nums.length-arrayList.size();i++){
            arrayList.add((int)0);
        }
        for (int i = 0; i <nums.length ; i++) {
            nums[i]=(int)arrayList.get(i);
        }
    }

}
