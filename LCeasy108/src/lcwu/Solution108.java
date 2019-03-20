package lcwu;
import java.util.Arrays;
public class Solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {

        if (nums.length == 0) return null;
        if (nums.length == 1) return (new TreeNode(nums[0]));

        int low = 0, high = nums.length - 1, mid = nums.length / 2;

        TreeNode root = new TreeNode(nums[mid]);

        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, low, mid));
        if (mid != high) {
            root.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid + 1, high + 1));
        }
        return root;
    }
}
