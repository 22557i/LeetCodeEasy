package lcwu;

import java.util.*;
public class Solution257 {

    public List<String> binaryTreePaths(TreeNode root) {
        if(root ==null) return null;

    }

    void helper(TreeNode root,StringBuilder s){
        if(root==null){
            return;
        }
        s.append(root.val+"");
        if(root.left==null && root.right==null){
            ls.add(s.toString());
        }
        s.append("->");
        helper(root.left,new StringBuilder(s));
        helper(root.right,new StringBuilder(s));

    }
}
