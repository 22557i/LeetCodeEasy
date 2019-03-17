package lcwu;

public class Solution27 {
    public int removeElement(int[] nums, int val) {
        int temp =0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[temp]=nums[j];
                temp++;
            }
        }
        return temp;
    }
    public static void main(String args[]){
        Solution27 s27=new Solution27();
        int [] nums = {3,2,2,3};
        int val = 2;
        int a =s27.removeElement(nums,val);
        System.out.println(a);
        for(int i =0;i<a;i++){
            System.out.println(nums[i]);
        }
    }
}
