/**
 * Created by Hao Wu on 10/29/19.
 */
public class Solution73 {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for (int i = 0; i <row ; i++) {
            if(matrix[i][0]==0){
                for (int j = 0; j <column ; j++) {
                    matrix[i][j]=0;
                }
            }
        }
        for (int i = 0; i <column ; i++) {
            if(matrix[0][i]==0){
                for (int j = 0; j < row; j++) {
                    matrix[j][i]=0;
                }
            }
        }
    }
}
