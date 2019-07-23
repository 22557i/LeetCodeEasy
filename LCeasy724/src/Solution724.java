import java.util.Arrays;

public class Solution724 {
	public int pivotIndex(int[] nums) {
		if(nums.length<3)return -1;
		for (int i = 0; i <nums.length ; i++) {
			if(Arrays.stream(Arrays.copyOfRange(nums, 0, i)).sum()== Arrays.stream(Arrays.copyOfRange(nums, i + 1, nums.length)).sum())return i;
		}
		return -1;
	}
}
