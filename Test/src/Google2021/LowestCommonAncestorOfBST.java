package Google2021;

import Google2021.DataStructure.TreeNode;

public class LowestCommonAncestorOfBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val<root.val && q.val<root.val)
            return lowestCommonAncestor(root.left,p,q);
        else if (p.val>root.val&&q.val>root.val)
            return lowestCommonAncestor(root.right, p, q);

        else return root;
    }
}
