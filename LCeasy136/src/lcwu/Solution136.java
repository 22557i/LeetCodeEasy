package lcwu;

import java.util.Map;
import java.util.TreeMap;

public class Solution136 {
    public int singleNumber(int[] nums) {
        if(nums.length==1)return nums[0];

        Map<Integer,Integer>Res= new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            Res.put(nums[i],0);
        }
        for(int i=0;i<nums.length;i++){
            int count =Res.get(nums[i]);
            Res.put(nums[i],(++count));
        }
        return getKey(Res,1).intValue();
    }
    Integer getKey(Map<Integer,Integer>map,Integer s){
        for(Map.Entry entry:map.entrySet()){
            if(s.equals(entry.getValue()))return Integer.valueOf(entry.getKey().toString());
        }
        return null;
    }
}