/**
 * Created by Hao Wu on 10/30/19.
 */
import java.util.*;
public class Solution {
    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> p = new ArrayList<>();
        dfs(res,p,1,k,n);
        return res;
    }
    public void dfs(List<List<Integer>>list,List<Integer>p,int index,int k,int n){
        if(p.size()==k){
            list.add(new ArrayList<>(p));
            return;
        }
        else {
            for (int i = index; i <n+1 ; i++) {
                p.add(i);
                dfs(list,p,i+1,k,n);
                p.remove(p.size()-1);
            }

        }
    }

}
