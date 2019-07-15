import java.util.Arrays;

public class Solution581 {
	public int findUnsortedSubarray(int[] nums) {
		int[]temp = new int[nums.length];
		for (int i = 0; i <nums.length ; i++) {
			temp[i] = nums[i];
		}

		Arrays.sort(temp);
		int i =0;
		int j = nums.length-1;
		while(i<j){
			if(nums[i]==temp[i])i++;
			if(nums[j]==temp[j])j--;
			if(nums[i]!=temp[i]&&nums[j]!=temp[j])return j-i+1;
		}
		return 0;
	}
}
