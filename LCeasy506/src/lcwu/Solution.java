package lcwu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.*;

public class Solution {
	public String[] findRelativeRanks(int[] nums) {
		int n = nums.length;
		int[] temp = new int[n];
		for(int i=0;i<n;i++){
			temp[i] = nums[i];
		}
		Arrays.sort(temp);
		HashMap<Integer,String> map = new HashMap<>();
		if(n>=1)
			map.put(temp[n-1],"Gold Medal");
		if(n>=2)
			map.put(temp[n-2],"Silver Medal");
		if(n>=3)
			map.put(temp[n-3],"Bronze Medal");
		if(n>=4){
			for(int i = 0;i<(n-3);i++){
				map.put(temp[i],String.format("%d",n-i));
			}
		}
		String[] res = new String[n];
		for(int i=0;i<n;i++){
			res[i] =map.get(nums[i]);
		}
		return res;
	}
}
