/**
 * Created by Hao Wu on 11/25/19.
 */
import java.util.*;
public class Solution1260 {
    public List<List<Integer>> shiftGrid(int[][]grid,int k){
        int n = grid.length;
        List<List<Integer>> res = new ArrayList<>();
        if(grid[0].length==0)return res;
        int m = grid[0].length;
        k = k%(m*n);
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
               temp.add(grid[i][j]);
            }
        }
        int count=0;
        for (int i = 0; i <n ; i++) {
            List<Integer>row = new ArrayList<>();
            for (int j = 0; j <m; j++) {
                if(k>0){
                row.add(temp.get(temp.size()-k--));
                }else{
                row.add(temp.get(count++));
                }
            }
            res.add(row);
        }
        return res;
    }
}
