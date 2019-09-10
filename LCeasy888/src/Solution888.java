import java.util.Arrays;

public class Solution888 {
	public int[] fairCandySwap(int[] A, int[] B) {
		int suma = Arrays.stream(A).sum();
		int sumb = Arrays.stream(B).sum();
		for (int i = 0; i <A.length ; i++) {
			for (int j = 0; j < B.length; j++) {
				if(suma+2*B[j]==sumb+2*A[i])return new int[]{A[i],B[j]};
			}
		}
		return null;
	}
}
