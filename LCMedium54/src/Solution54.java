import java.util.LinkedList;

/**
 * Created by Hao Wu on 10/15/19.
 */
import java.util.*;
public class Solution54 {
    int direction[][] ={{0,1},{1,0},{0,-1},{-1,0}};
    boolean visited[][];
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new LinkedList<>();
        if(matrix.length==0)return res;
        int row = matrix.length;
        int colunm = matrix[0].length;
        visited = new boolean[row][colunm];
        int i=0,j=0;
        int di=0;
        for (int k = 0; k <row*colunm ; k++) {
            res.add(matrix[i][j]);
            visited[i][j] = true;
            int ci = i+direction[di][0];
            int cj = j+direction[di][1];
            if(ci>=0&&ci<row&&cj>=0&&cj<colunm&&!visited[ci][cj]){
                i= ci;
                j = cj;
            }else{
                di= (di+1)%4;
                i += direction[di][0];
                j += direction[di][1];
            }
        }

        return res;
    }
}
