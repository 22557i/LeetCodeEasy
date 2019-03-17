package lcwu;

public class Solution26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)return 0;
       int temp = 0;
       for(int i =0;i<nums.length-1;i++){
           if(nums[i]>nums[i+1]){
               temp = nums[i];
               nums[i]=nums[i+1];
               nums[i+1]=temp;

           }
       }
       temp =0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[temp]) {
                temp++;
                nums[temp] = nums[j];
            }
        }
        return ++temp;

    }

    public static void main(String args[]){
        int []nums = {0,0,1,2,2,3,3,3,4,4,4,5,6,6,6,6};
        Solution26 s26= new Solution26();
        System.out.println(s26.removeDuplicates(nums));
       for(Integer a:nums) {
           System.out.println(a);
       }
    }
}
