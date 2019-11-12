package Homework6;

/**
 * Created by Hao Wu on 10/14/19.
 */
public class Q4 {
    public int searchMax(TreeNode root){
        if(root.right==null)return root.val;
        else return searchMax(root.right);
    }

    public int searchMaxR(TreeNode root){
        TreeNode n = root;
        while(n.right!=null){
          n = n.right;
        }
        return n.val;
    }
}
