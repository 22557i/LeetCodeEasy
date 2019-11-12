/**
 * Created by Hao Wu on 10/17/19.
 */
public class Solution {
    int direction[][] ={{0,1},{1,0},{0,-1},{-1,0}};
    boolean visited[][];
    public int[][] generateMatrix(int n) {
        int[][]res = new int[n][n];
        if(n==0)return res;


        visited = new boolean[n][n];
        int i=0,j=0;
        int di=0;
        for (int k = 1; k <n*n+1 ; k++) {
            res[i][j]=k;
            visited[i][j] = true;
            int ci = i+direction[di][0];
            int cj = j+direction[di][1];
            if(ci>=0&&ci<n&&cj>=0&&cj<n&&!visited[ci][cj]){
                i= ci;
                j = cj;
            }else{
                di++;
                di = di%4;
                i += direction[di][0];
                j += direction[di][1];
            }
        }

        return res;
    }
}
