package lcwu;
import java.util.*;
public class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, int[]> map = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                int[] val = map.get(nums1[i]);
                map.put(nums1[i], new int[]{val[0]+1, 0});
            }else{
                int[] val = {1,0};
                map.put(nums1[i],val);
            }
        }

        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){
                int[] val = map.get(nums2[i]);
                map.put(nums2[i], new int[]{val[0], val[1]+1});
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(Map.Entry mm: map.entrySet()){
            int key = (int)mm.getKey();
            int[] value = (int[])mm.getValue();
            int min = Math.min(value[0],value[1]);
            for(int i=0;i<min;i++){
                list.add(key);
            }
        }

        int[] out = new int[list.size()];
        for(int i=0;i<list.size();i++){
            out[i] = list.get(i);
        }
        return out;

    }
}
