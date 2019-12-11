/**
 * Created by Hao Wu on 12/6/19.
 */
import java.util.*;
public class Solution939 {
    public int minAreaRect(int[][] points) {
        Set<Integer> set = new HashSet<>();
        int ans = Integer.MAX_VALUE;
        for(int[] n:points)
            set.add(n[0]*10001+n[1]);
        for(int i =0;i<points.length;i++)
            for(int j=i+1;j<points.length;++j){
                if(points[j][0]!=points[i][0]&&points[i][1]!=points[j][1]){
                    if(set.contains(10001*points[i][0]+points[j][1])&&set.contains(points[j][0]*10001+points[i][1]))
                        ans = Math.min(ans,Math.abs((points[j][1]-points[i][1])*(points[j][0]-points[i][0])));
                }
            }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}
