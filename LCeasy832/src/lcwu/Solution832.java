package lcwu;

public class Solution832 {
	public int[][] flipAndInvertImage(int[][] A) {
		int row = A.length;
		int colnum = A[0].length;
		for (int i = 0; i <row ; i++) {
			for (int j = 0; j < colnum/2; j++) {
				int temp = A[i][j];
				A[i][j] = A[i][colnum-1-j];
				A[i][colnum-1-j] =temp;
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				A[i][j]=(A[i][j]+1)%2;
			}
		}
		return A;
	}
}
