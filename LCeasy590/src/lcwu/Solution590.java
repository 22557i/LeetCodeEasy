package lcwu;
import java.util.*;
public class Solution590 {
	ArrayList<Integer> res= new ArrayList<>();
	public List<Integer> postorder(Node root) {
		if(root!=null){

			for(Node node:root.children){
				postorder(node);
			}
			res.add(root.val);
		}
		return res;
	}
	class Node {
		public int val;
		public List<Node> children;

		public Node() {}

		public Node(int _val,List<Node> _children) {
			val = _val;
			children = _children;
		}
	};
}
