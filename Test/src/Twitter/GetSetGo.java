package Twitter;

import java.util.Arrays;

public class GetSetGo {
    public static void main(String[] args) {
        int[] nums1 = { 2, 9, 5, 1, 6 };
        int target1 = 12;
        int[] nums2 = { 2, 3, 15, 1, 16 };
        int target2 = 8;
        System.out.println(isPossible(nums1, target1));
        System.out.println(isPossible(nums2, target2));
        System.out.println("");
        System.out.println("---------------------");
        System.out.println(isPossibleDfs(nums1, target1));
        System.out.println(isPossibleDfs(nums2, target2));

    }

    private static boolean isPossibleDfs(int[] nums, int target) {
        return dfs(nums, target, 0);
    }

    private static boolean dfs(int[] nums, int target, int i) {
        if(target < 0 || i >= nums.length)
            return false;
        if(target == 0)
            return true;
        if(dfs(nums, target - nums[i], i+1) || dfs(nums, target, i+1))
            return true;
        return false;
    }

    private static boolean isPossible(int[] nums, int target) {
        Arrays.sort(nums);
        boolean[][] dp = new boolean[nums.length+1][target + 1];
        for(int i=0;i<dp.length;i++) {
            dp[i][0] = true;
        }
        for(int i=1;i<dp.length;i++) {
            for(int j=1;j<dp[0].length;j++) {
                if(j >= nums[i-1])
                    dp[i][j] |= dp[i-1][j] | dp[i-1][j-nums[i-1]];
                else
                    dp[i][j] |= dp[i-1][j];
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
