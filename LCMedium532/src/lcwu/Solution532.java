package lcwu;

import java.util.*;

public class Solution532 {

	public int findPairs(int[] nums, int k) {
		int cnt=0;

		Map<Integer,Integer> m=new HashMap<>();
		for(int i=0;i<nums.length;i++){

			if(m.containsKey(nums[i])) {
				m.put(nums[i], m.get(nums[i]) + 1);

			}
			else
				m.put(nums[i],1);
		}

		for(int i=0;i<nums.length;i++){

			if(k>=0){

				int x=nums[i]-k;

				if(m.containsKey(x) && nums[i]!=x){
					cnt+=1;
					m.remove(x);
				}

				else if(m.containsKey(x)){

					if(m.get(x)>1){
						cnt+=1;
						m.put(nums[i],1);
					}
				}
			}
			else
				return cnt;
		}

		return cnt;
	}
}
