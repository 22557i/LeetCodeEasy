public class Solution941 {
	public boolean validMountainArray(int[] A) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i <A.length ; i++) {
			max=Math.max(max,A[i]);
		}
		int indexmax=-1;
		for (int i = 0; i <A.length ; i++) {
			if(A[i]==max)indexmax=i;
		}
		if(indexmax==0||indexmax==A.length-1)return false;
		for (int i = 0; i < indexmax; i++) {
			if(A[i]>=A[i+1])return false;
		}
		for (int i = indexmax; i <A.length-1 ; i++) {
			if(A[i]<=A[i+1])return false;
		}
		return true;
	}
}
