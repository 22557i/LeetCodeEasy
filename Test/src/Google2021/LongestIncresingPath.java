package Google2021;

public class LongestIncresingPath {
    private static final int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    private int m, n;


    public int longestIncreasingPath(int[][] matrix) {
        m = matrix.length;
        if(m==0)return m;
        n = matrix[0].length;
        int store[][] = new int[m][n];
        int res = 0;

        for(int i =0;i<m;i++)
            for(int j = 0;j<n;j++)
                res = Math.max(res,dfs(matrix,i,j,store));


        return res;

    }

    private int dfs(int [][]matrix, int i,int j,int [][]store) {
        if(store[i][j]!=0)return store[i][j];

        for(int[] nums:dirs){
            int x = i+nums[0], y = j+nums[1];
            if(x>=0 && x< m &&y>=0 && y<n && matrix[x][y]>matrix[i][j]){
                store[i][j] = Math.max(store[i][j],dfs(matrix,x,y,store));
            }

        }
        return ++store[i][j];
    }


}
