package lcwu;

import java.util.ArrayList;
import java.util.Collections;

public class Solution897 {
	TreeNode res = new TreeNode(0), curr = res;
	public TreeNode increasingBST(TreeNode root) {
		if(root == null)
			return root;
		increasingBST(root.left);
		curr.right = new TreeNode(root.val);
		curr = curr.right;
		increasingBST(root.right);
		return res.right;
	}
}
