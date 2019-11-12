/**
 * Created by Hao Wu on 10/23/19.
 */
import java.util.*;
public class Solution94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        inorder(res,root);
        return res;

    }
    public void inorder(List<Integer>list , TreeNode root){
        if(root==null)return;
        else {
            inorder(list,root.left);
            list.add(root.val);
            inorder(list,root.right);
        }
    }
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
