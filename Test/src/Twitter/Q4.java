package Twitter;

/**
 * Created by Hao Wu on 10/29/19.
 */
import java.util.*;
public class Q4 {
//    public static boolean isPossible(List<Integer> calCounts, int requiredCals) {
//      int nums[] = new int[calCounts.size()];
//        for (int i = 0; i <nums.length ; i++) {
//            nums[i] = calCounts.get(i);
//        }
//
//        Arrays.sort(nums);
//
//        boolean dp[][] = new boolean[nums.length+1][requiredCals+1];
//        for (int i = 0; i < nums.length+1; i++) {
//            dp[i][0] = true;
//        }
//        for (int i = 1; i <dp[0].length+1 ; i++) {
//            for (int j = 1; j <nums.length+1 ; j++) {
//                if(j>=nums[i-1])dp[i][j] |=dp[i-1][j]|dp[i-1][j-nums[i-1]];
//                else dp[i][j]|=dp[i-1][j];
//            }
//        }
//        return dp[nums.length][dp[0].length-1];
//    }
   public static boolean isPossible(List<Integer>arr,int requiredCals){
        int nums[] = new int[arr.size()];
       for (int i = 0; i < arr.size(); i++) {
           nums[i] = arr.get(i);
       }
       Arrays.sort(nums);
        return   dfs(nums,requiredCals,0);
   }
   public static boolean dfs(int[]nums, int t,int index){
        if(t<0||index>=nums.length)return false;
        if(t==0||t==nums[index])return true;
        if(dfs(nums,t-nums[index],index+1)||dfs(nums,t,index+1))return true;
        return false;
   }
}
