package lcwu;

class Solution198 {
    public int rob(int[] nums) {
        if(nums==null||nums.length ==0)return 0;

        int Res[] = new int[nums.length+2];
        for(int i=0;i<Res.length-2;i++ ){
            Res[i+2]+=Math.max(nums[i]+Res[i],Res[i+1]);

        }
        return Res[Res.length-1];

    }
}


