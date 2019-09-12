package lcwu;

import java.util.*;
public class Solution989 {
	public List<Integer> addToArrayForm(int[] A, int K) {
		int cur = K;
		List<Integer> res = new ArrayList<>();

		for (int i = A.length-1; i >=0||cur>0 ; i--) {
			if(i>=0){
				cur+=A[i];

			}
			res.add(cur%10);
			cur/=10;
		}
	Collections.reverse(res);
		return res;

	}
}
