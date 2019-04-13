package lcwu;

public class Solution496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] map = new int[10000];
        for(int i=0;i<nums2.length;i++){
            map[nums2[i]] = i;
        }
        for(int i=0;i<nums1.length;i++){
            for(int j=map[nums1[i]];j<nums2.length;j++){
                if(nums1[i]<nums2[j]){
                    nums1[i]=nums2[j];
                    break;
                }
                if(j==nums2.length-1 && nums1[i]>=nums2[j]){
                    nums1[i]=-1;
                    break;
                }
            }
        }
        return nums1;
    }
}
