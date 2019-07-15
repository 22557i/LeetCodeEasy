import java.util.ArrayList;
import java.util.*;
public class Solution993 {

	Map<Integer, TreeNode> parent;
	Map<Integer, Integer> depth;
	public boolean isCousins(TreeNode root, int x, int y) {
		depth = new HashMap();
		parent = new HashMap();
		dfs(root, null);
		return (depth.get(x) == depth.get(y) && parent.get(x) != parent.get(y));
	}

	public void dfs(TreeNode node, TreeNode par) {
		if (node != null) {
			depth.put(node.val, par != null ? 1 + depth.get(par.val) : 0);
			parent.put(node.val, par);
			dfs(node.left, node);
			dfs(node.right, node);
		}
	}
	public int deepthTree(TreeNode node){
		if (node==null){
			return 0;  //递归跳出条件
		}
		return Math.max(deepthTree(node.left),deepthTree(node.right))+1;
	}
}
