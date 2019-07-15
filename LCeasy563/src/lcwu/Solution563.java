package lcwu;

public class Solution563 {
	int res =0;
	public int findTilt(TreeNode root) {
		traverse(root);
		return res;
	}
	public int traverse(TreeNode root)
	{
		if (root == null )return 0;
		int left = traverse(root.left);
		int right = traverse(root.right);
		res += Math.abs(left-right);
		return left + right + root.val;
	}
}
