package lcwu;

/**
 * Created by Hao Wu on 10/2/19.
 */
public class Solution547 {
    int row;
    boolean visited[];
    int count=0;
    public int findCircleNum(int[][] M) {
      row = M.length;
      visited = new boolean[row];
        for (int i = 0; i <row ; i++) {
            if(!visited[i]){
                dfs(M,i);
                count++;
            }
        }
        return count;
    }
    public void dfs(int[][]M,int k){
        for (int i = 0; i <row ; i++) {
            if(M[k][i]==1&&!visited[i]){
                visited[i]=true;
                dfs(M,i);
            }
        }
    }
}
