package lcwu;
import java.util.*;
public class Solution530 {
	public int getMinimumDifference(TreeNode root) {
		if(root==null) return 0;
		int min=Integer.MAX_VALUE;
		List<Integer> list = new ArrayList<>();
		inorder(root,list);
		for(int i=0; i<list.size()-1; i++) {
			min = Math.min(min, list.get(i+1)-list.get(i));
		}
		return min;
	}
	private void inorder(TreeNode root, List<Integer> list) {
		if(root==null) return;
		inorder(root.left, list);
		list.add(root.val);
		inorder(root.right, list);
	}
}
