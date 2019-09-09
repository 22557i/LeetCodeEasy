package lcwu;

import java.util.LinkedList;
import java.util.List;

public class Solution872 {
	List<Integer>list1 = new LinkedList<>();
	List<Integer>list2 = new LinkedList<>();
	public boolean leafSimilar(TreeNode root1, TreeNode root2) {
		tranverse(root1,list1);
		tranverse(root2,list2);
		return list1.equals(list2);
	}
	public void tranverse(TreeNode root, List list){
		if(root!=null){
			if(root.left==null&&root.right==null)list.add(root.val);
			tranverse(root.left,list);
			tranverse(root.right,list);
		}
	}
}
