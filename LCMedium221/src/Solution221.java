/**
 * Created by Hao Wu on 10/23/19.
 */
public class Solution221 {
    public int maximalSquare(char[][] matrix) {
        int row = matrix.length;
        int cols =row>0?matrix[0].length:0;
        int[][]dp = new int[row+1][cols+1];
        int max = 0;
        for(int i =1;i<row+1;++i){
            for (int j = 1; j <cols+1 ; ++j) {
                if(matrix[i-1][j-1]=='1'){
                    dp[i][j] =Math.min( Math.min(dp[i][j-1],dp[i-1][j]),dp[i-1][j-1])+1;
                    max = Math.max(max,dp[i][j]);
                }
            }
        }
        return max*max;
    }
}
