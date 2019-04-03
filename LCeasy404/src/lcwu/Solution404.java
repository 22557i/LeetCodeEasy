package lcwu;

public class Solution404 {

    public int sumOfLeftLeaves(TreeNode root){
       int sum = 0;
        if(root == null)return 0;
        if(root.left != null) {
            if(root.left.left == null && root.left.right == null) sum += root.left.val;
            else sum += sumOfLeftLeaves(root.left);
        }
        return sum+sumOfLeftLeaves(root.right);
    }
}
