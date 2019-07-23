package lcwu;

import java.util.*;
public class Solution746 {
	public int minCostClimbingStairs(int[] cost) {
		int[] dp =new int[cost.length+1];
		dp[0]=0;
		dp[1]=0;
		for (int i = 2; i <cost.length+1 ; i++) {
			dp[i] = Math.min(dp[i-2]+cost[i-2],dp[i-1]+cost[i-1]);
		}
		return dp[dp.length-1];
	}
	public int findMinArrowShots(int[][] points) {
		if (points.length == 0)
			return 0;
		Arrays.sort(points, (a,b)->(a[0]-b[0]));
		int end = points[0][1];
		int arrows = 1;
		for (int i = 1; i < points.length; i++) {
			if (points[i][0] > end) {
				end = points[i][1];
				arrows++;
			} else {
				end = Math.min(end, points[i][1]);
			}
		}
		return arrows;
	}
}
