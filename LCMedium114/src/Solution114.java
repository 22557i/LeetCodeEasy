import java.util.ArrayDeque;

/**
 * Created by Hao Wu on 11/8/19.
 */
import java.util.*;
public class Solution114 {
    Queue<TreeNode>q = new ArrayDeque<>();
    public void flatten(TreeNode root){
      if(root==null)return;
      flatten(root.left);
      flatten(root.right);

      TreeNode tempr = root.right;
      root.right = root.left;
      root.left = null;
      while(root.right!=null)root = root.right;
      root.right = tempr;
      root.left =null;
    }

}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }