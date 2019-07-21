package lcwu;

public class Solution700 {
	public TreeNode searchBST(TreeNode root, int val) {
		if(root.val==val)return root;
		if(root.val>val&&root.left!=null)return searchBST(root.left,val);
		if(root.val<val&&root.right!=null) return searchBST(root.right,val);
		if(root.left==null&&root.right==null)return null;
		return null;
	}
	public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
