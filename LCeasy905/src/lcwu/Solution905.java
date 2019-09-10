package lcwu;

import java.util.*;

public class Solution905 {
	public int[] sortArrayByParity(int[] A) {
		List<Integer>even = new ArrayList<>();
		List<Integer>odd = new ArrayList<>();
		Arrays.sort(A);
		for (int n :A){
			if(n%2==0)even.add(n);
			else odd.add(n);
		}
		for (Integer n:odd){
			even.add(n);
		}
		for (int i = 0; i < A.length; i++) {
			A[i] = even.get(i);
		}
		return A;
	}
}
