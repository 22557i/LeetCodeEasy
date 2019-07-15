package lcwu;

import java.util.Arrays;

public class Solution561 {
	public int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int res=0;
		for (int i = 0; i <nums.length/2 ; i++) {
			res+=nums[i*2];
		}
		return res;
	}
}
