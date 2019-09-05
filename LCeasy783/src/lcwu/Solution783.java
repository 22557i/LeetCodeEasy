package lcwu;

import java.util.*;
public class Solution783 {
	public int minDiffInBST(TreeNode root) {
		List <Integer>list=new ArrayList<>();
		inorder(root,list);
		int delta=Integer.MAX_VALUE;
		for(int i=0;i<list.size()-1;i++){
			if(delta>(list.get(i+1)-list.get(i)))
				delta=list.get(i+1)-list.get(i);
		}
		return delta;
	}

	public void inorder(TreeNode root,List<Integer> list){
		if(root==null)
			return;
		inorder(root.left,list);
		list.add(root.val);
		inorder(root.right,list);
	}
	public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
