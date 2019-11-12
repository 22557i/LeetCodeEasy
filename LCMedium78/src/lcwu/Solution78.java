package lcwu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hao Wu on 10/30/19.
 */
public class Solution78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

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
                p.add(nums[i]);
                dfs(list,p,i+1,nums,k);
                p.remove(p.size()-1);
            }

        }
    }
}
