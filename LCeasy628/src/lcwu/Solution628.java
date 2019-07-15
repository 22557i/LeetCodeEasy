package lcwu;


import java.util.Arrays;

public class Solution628 {
	public int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		int n  = nums.length;
		int res1 = nums[n-1]*nums[n-2]*nums[n-3];
		int res2 =0;
		if(nums[0]<0&&nums[1]<0){
			res2 = nums[0]*nums[1]*nums[n-1];
		}
		return Math.max(res1,res2);
	}
}
