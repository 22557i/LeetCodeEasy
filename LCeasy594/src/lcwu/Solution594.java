package lcwu;

import java.util.Arrays;

public class Solution594 {
	public int findLHS(int[] nums) {
		int count=0;
		System.out.println(maxArray(nums));
		System.out.println(minArray(nums));
		for (int i = 0; i <nums.length-1 ; i++) {
			for (int j = i+1; j <nums.length ; j++) {
				if(isMatch(Arrays.copyOfRange(nums,i,j)))count=Math.max(count,j-i+1);
				System.out.println("_____________________________");
			}
		}
		return count+1;
	}
	public int maxArray(int[] nums){
		if(nums==null)return 0;
		int max = Integer.MIN_VALUE;
		for(int a:nums){
			max=Math.max(max,a);
		}
		return max;

	}
	public int minArray(int[] nums){
		if(nums==null)return 0;
		int min = Integer.MAX_VALUE;
		for(int a:nums){
			min=Math.min(min,a);
		}
		return min;
	}
	public boolean isMatch(int[] nums){
		return maxArray(nums)-minArray(nums)==1;
	}
}
// if (nums.length == 0 || nums.length == 1)
//		 return 0;
//		 Arrays.sort(nums);
//		 int countPre = 0;
//		 int current = nums[0];
//		 int countCurrent = 0;
//		 int max = 0;
//		 for (int i = 0; i < nums.length; i++) {
//		if (nums[i] == current)
//		countCurrent++;
//		else {
//		if (nums[i] == current + 1)
//		countPre = countCurrent;
//		else
//		countPre = 0;
//		countCurrent = 1;
//		current = nums[i];
//		}
//		if (countPre != 0)
//		max = Math.max(max, countCurrent + countPre);
//		}
//		return max;