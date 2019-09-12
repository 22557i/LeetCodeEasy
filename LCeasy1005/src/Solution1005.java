import java.util.*;

public class Solution1005 {
	public int largestSumAfterKNegations(int[] A, int K) {
		Arrays.sort(A);
		int sum=0;
		int minPositive=Integer.MAX_VALUE;
		for(int i=0;i<A.length;i++){
			if(A[i]<0 && K>0){
				A[i] = -A[i];
				K--;
			}
			minPositive=Math.min(minPositive,A[i]);
			sum+=A[i];
		}
		if(K>0 && K%2==1){
			sum=sum-2*minPositive;
		}
		return sum;
	}
}
