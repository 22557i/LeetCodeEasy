public class Solution896 {
	public boolean isMonotonic(int[] A) {
		return isup(A)||isdown(A);
	}
	public boolean isup(int[]A){
		for (int i = 0; i <A.length-1 ; i++) {
			if(A[i]>A[i+1])return false;
		}
		return true;
	}
	public boolean isdown(int[]A){
		for (int i = 0; i <A.length-1 ; i++) {
			if(A[i]<A[i+1])return false;
		}
		return true;
	}
}
