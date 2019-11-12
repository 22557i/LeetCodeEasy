/**
 * Created by Hao Wu on 10/10/19.
 */
public class Solution152 {
    public int maxProduct(int[] nums) {
        int n = nums.length;

        if(n == 0) return n;
        int[] min = new int[n];
        int[] max = new int[n];
        int result;
        result = min[0] = max[0] = nums[0];

        for(int i = 1; i < n ; i++) {
            if(nums[i] > 0) {
                max[i] = Math.max(nums[i], nums[i] * max[i-1]);
                min[i] = Math.min(nums[i], nums[i] * min[i-1]);
            } else {
                max[i] = Math.max(nums[i], nums[i] * min[i-1]);
                min[i] = Math.min(nums[i], nums[i] * max[i-1]);
            }
            result = Math.max(result, max[i]);
        }
        return result;
    }
}
