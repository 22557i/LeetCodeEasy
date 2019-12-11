import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Hao Wu on 12/5/19.
 */
public class Solution210 {
    boolean flag = true;
    private int grid[][];
    List<Integer> set = new ArrayList<>();
    ArrayList<Integer>res = new ArrayList<>();
    public void dfs(int v){
        if(set.contains(v)){
            flag = false;
            return;
        }
        set.add(v);
        if(set.size()==grid.length)res.addAll(set);
        for(int i =0;i<grid.length;++i){
            if(grid[v][i]!=0&&i!=v)
                dfs(i);
        }
        set.remove(set.size()-1);
    }
    public int[] findOrder(int numCourses, int[][] prerequisites){
        if(prerequisites.length==0){
            int result[] = new int[numCourses];
            for (int i = 0; i < numCourses; i++) {
                result[i]=i;
            }
            return result;
        }
        grid = new int[numCourses][numCourses];
        for (int[] n :prerequisites){
            grid[n[1]][n[0]]=1;
        }
        for (int i = 0; i <numCourses ; i++) {
            dfs(i);
            if(!flag)return new int[]{};

        }
        if(res.size()!=numCourses)return null;
        int result [] = new int[numCourses];
        for (int i = 0; i <numCourses ; i++) {
            result[i] = res.get(i);
        }
        return result;
    }
}
