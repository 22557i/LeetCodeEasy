/**
 * Created by Hao Wu on 10/2/19.
 */
public class Solution200 {
    int count=0;
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int row = grid.length;
        int column = grid[0].length;
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }
    public void dfs(char[][]grid,int r,int c){
        int row = grid.length;
        int column = grid[0].length;
        if(r<0||c<0||r>=row||c>column||grid[r][c]=='0')return;

        grid[r][c] = '0';
        if(r>0)dfs(grid, r - 1, c);
        if(r<row-1)dfs(grid, r + 1, c);
        if(c>0)dfs(grid, r, c - 1);
        if(c<column-1)dfs(grid, r, c + 1);

    }

}
