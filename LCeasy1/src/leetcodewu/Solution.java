package leetcodewu;

public class Solution {
    public int[] twoSum(int[]nums,int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(target-nums[j]==nums[i])
                    return new int []{i,j};

            }
        }
        throw new IllegalArgumentException("No result");
    }
    public static void main (String args[]){
    int nums[]={2,7,11,15};
    int t =9;
    Solution s = new Solution();
    int b[] =s.twoSum(nums,t);
    for(int ac:b)
    System.out.println(ac);
    }
}
