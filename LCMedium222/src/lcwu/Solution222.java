package lcwu;

/**
 * Created by Hao Wu on 12/2/19.
 */
public class Solution222 {
    public int countNodes(TreeNode root) {
        return root==null?0:1+countNodes(root.left)+countNodes(root.right);
    }
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }