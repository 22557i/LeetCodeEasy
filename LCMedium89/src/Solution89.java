/**
 * Created by Hao Wu on 11/1/19.
 */
import java.util.*;
public class Solution89 {
    public List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<Integer>();
        if(n == 0) {
            ans.add(0);
            return ans;
        }
        //递归问题：最高位分0,1讨论，最高位是0时
        List<Integer> part1 = grayCode(n - 1);
        //反转第一部分，最高位是1时
        List<Integer> part2 = new ArrayList<Integer>();
        int high = (int)Math.pow(2, n - 1);
        for(int i = part1.size() - 1; i >= 0; i--) {
            part2.add(high + part1.get(i));
        }
        //合并两种情况
        ans.addAll(part1);
        ans.addAll(part2);
        return ans;
    }
}
