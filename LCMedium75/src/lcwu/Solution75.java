package lcwu;

/**
 * Created by Hao Wu on 10/29/19.
 */
public class Solution75 {
    public void sortColors(int[] nums) {
      int p0 = 0;
      int cur = 0;
      int p2 = nums.length-1;
      int temp=-1;
      while (cur<=p2){
          if(nums[cur]==0){
              temp = nums[p0];
              nums[p0++] = nums[cur];
              nums[cur++] = temp;
          }else if( nums[cur]==2){
              temp = nums[cur];
              nums[cur ]=nums[p2];
              nums[p2--] = temp;
          }else cur++;
      }
    }
}
