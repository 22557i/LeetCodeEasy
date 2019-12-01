/**
 * Created by Hao Wu on 11/28/19.
 */
public class BinarySearch {
    public int binarySearch(int[]nums,int k){
        int l = 0;
        int r = nums.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]==k)return mid;
            if(nums[mid]<k) l = mid+1;
            else r = mid-1;
        }
        return -1;
    }
}
