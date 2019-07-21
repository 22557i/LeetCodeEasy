package lcwu;

public class Solution687 {
	int count=0;
	public int longestUnivaluePath(TreeNode root) {
		helper(root);
		return count;
	}
	public int helper(TreeNode root){
		if(root ==null)return 0;
		int left = helper(root.left);
		int right = helper(root.right);
		int aL=0;
		int aR=0;
		if(root.left!=null&&root.left.val==root.val){
			aL+=left+1;
		}
		if(root.right!=null&&root.right.val==root.val){
			aR+=right+1;
		}
		count = Math.max(count,aL+aR);
		return Math.max(aL,aR);
	}
}
