package lcwu;

public class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0;i<numbers.length;i++){
            int index =binarySearch(numbers,i+1,numbers.length-1,target-numbers[i]);
            if(index!=-1)return new int[]{i+1,index+1};
        }
        return null;
    }

    public int binarySearch(int []nums,int l,int r,int target){
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]==target)return mid;
            if(nums[mid]>target)r = mid-1;
            else l = mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution167 solution167 = new Solution167();

        System.out.println(solution167.twoSum(new int[]{2,3,4},6));
    }
}

