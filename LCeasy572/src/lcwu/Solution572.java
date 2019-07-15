package lcwu;

public class Solution572 {

	public boolean isSubtree(TreeNode s, TreeNode t) {
		return traverse(s,t);
	}

	public  boolean isSameTree(TreeNode tree1,TreeNode tree2){
		if (tree1==null&&tree2==null){
			return true;
		}
		else if (tree1==null||tree2==null){
			return false;
		}
		if(tree1!=null&&tree2!=null){
			if(tree1.val!=tree2.val){
				return false;
			}
			else {
				return isSameTree(tree1.left,tree2.left)&&isSameTree(tree1.right,tree2.right);
			}
		}
		return false;
	}
	public boolean traverse(TreeNode s,TreeNode t)
	{
		return  s!=null && ( isSameTree(s,t) || traverse(s.left,t) || traverse(s.right,t));
	}
}
