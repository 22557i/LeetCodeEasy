/**
 * Created by Hao Wu on 10/31/19.
 */
public class Solution {
    public boolean search(int[] nums, int target) {
        if (nums.length == 0) {
            return false;
        }
        int pivot = nums.length - 1;
        for (int i=0; i<nums.length -1; i++) {
            if (nums[i] > nums[i+1]) {
                pivot = i;
                break;
            }
        }
        return hasElement(nums, 0, pivot +1, target) || hasElement(nums, pivot +1, nums.length, target);
    }

    private boolean hasElement(int nums[], int start, int end, int target) {
        while (start < end) {
            int mid = (start + end)/2;
            if (nums[mid] == target) {
                return true;
            } else {
                if (nums[mid] > target) {
                    end = mid;
                } else {
                    start = mid + 1;
                }
            }
        }
        return false;
    }
}
