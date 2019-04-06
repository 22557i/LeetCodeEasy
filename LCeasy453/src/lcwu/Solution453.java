package lcwu;

public class Solution453 {
    public int minMoves(int[] nums) {
        int steps=0,min=Integer.MAX_VALUE;
        for (int n:nums)
            min = Math.min(n,min);
        for (int n:nums)
            steps+=n-min;
        return steps;
    }
}
