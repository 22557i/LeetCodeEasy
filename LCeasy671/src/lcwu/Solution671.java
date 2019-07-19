package lcwu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution671 {
	ArrayList<TreeNode>list = new ArrayList<>();
	public int findSecondMinimumValue(TreeNode root) {
		if(root==null)return 0;
		traverse(root);
		Collections.sort(list,((o1, o2) -> o1.val>o2.val?1:-1));
		for (int i = 1; i <list.size() ; i++) {
			if(list.get(i).val!=list.get(0).val)return list.get(i).val;
		}
		return -1;
	}
	public void traverse(TreeNode root){
		if(root==null)return;
		list.add(root);
		traverse(root.left);
		traverse(root.right);
	}
}
