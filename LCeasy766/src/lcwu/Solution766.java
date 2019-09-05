package lcwu;

public class Solution766 {
	public boolean isToeplitzMatrix(int[][] matrix) {
		int row =matrix.length;
		if(row==0)return true;
		int colunm = matrix[0].length;
		for (int i = 1; i <row ; i++) {
			for (int j = 1; j <colunm ; j++) {
				if(matrix[i][j]!=matrix[i-1][j-1])return false;
			}
		}
		return true;
	}
}
