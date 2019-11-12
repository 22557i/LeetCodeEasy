package lcwu;

import java.util.LinkedList;

/**
 * Created by Hao Wu on 10/23/19.
 */
import java.util.*;
public class Solution98 {

    public boolean isValidBST(TreeNode root) {
       List<Integer> list = new LinkedList<>();
       inorder(list,root);
       if(list.size()<2)return true;
       else{
           for (int i = 0; i <list.size()-1 ; i++) {
               if(list.get(i)>=list.get(i+1))return false;
           }
       }
       return true;
    }
    public void inorder(List<Integer>list,TreeNode root){
        if(root==null)return;
        else{
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