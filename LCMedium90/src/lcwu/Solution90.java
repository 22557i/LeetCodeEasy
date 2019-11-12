package lcwu;

/**
 * Created by Hao Wu on 11/2/19.
 */
import java.util.*;
public class Solution90 {
    boolean [] visited;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        visited = new boolean[nums.length];
        Arrays.sort(nums);
        List<Integer> p = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            dfs(res,p,0,nums,i);
        }
        return res;
    }

    public void dfs(List<List<Integer>>list,List<Integer>p,int index,int []nums,int k){
        if(p.size()==k){
            list.add(new ArrayList<>(p));
            return;
        }
        else {

            for (int i = index; i <nums.length ; i++) {
                if(i>0&&nums[i]==nums[i-1]&&!visited[i-1])continue;
               if(!visited[i]) {
                   visited[i] = true;
                   p.add(nums[i]);
                   dfs(list, p, i + 1, nums, k);
                   p.remove(p.size() - 1);
                   visited[i] = false;
               }
            }

        }
    }
}
