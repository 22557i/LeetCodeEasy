package lcwu;

public class Solution747 {
	public int dominantIndex(int[] nums) {
		int max=-1;
		int secondmax=-1;
		for(int n:nums) max = Math.max(max,n);
		for (int i = 0; i <nums.length ; i++) {
			if(nums[i]!=max)secondmax = Math.max(secondmax,nums[i]);
		}
		if(max>=2*secondmax){
			for (int i = 0; i <nums.length ; i++) {
				if(nums[i]==max)return i;
			}
		}else return -1;
		return -1;
	}
}
