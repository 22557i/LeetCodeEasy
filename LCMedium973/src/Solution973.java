import java.util.*;

public class Solution973 {
    public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points,(a1,a2)->a1[0]*a1[0]+a1[1]*a1[1] - a2[0]*a2[0]-a2[1]*a2[1]);

        int res[][] = new int[K][2];

        for(int i =0;i<K;i++){
            res[i][0] = points[i][0];
            res[i][1] = points[i][1];
        }
        return res;
    }
}
