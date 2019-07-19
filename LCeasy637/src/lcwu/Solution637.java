package lcwu;

import java.util.*;
public class Solution637 {
	public List<Double> averageOfLevels(TreeNode root) {
		ArrayList<Double >res = new ArrayList<>();
		if(root == null) return res;
		Queue < TreeNode > queue = new LinkedList < > ();
		queue.add(root);
		while (!queue.isEmpty()) {
			long sum = 0, count = 0;
			Queue < TreeNode > temp = new LinkedList < > ();
			while (!queue.isEmpty()) {
				TreeNode n = queue.remove();
				sum += n.val;
				count++;
				if (n.left != null)
					temp.add(n.left);
				if (n.right != null)
					temp.add(n.right);
			}
			queue = temp;
			res.add(sum * 1.0 / count);
		}
		return res;
	}

}
