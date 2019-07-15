package lcwu;

import java.util.*;
public class Solution589 {
	ArrayList<Integer> res= new ArrayList<>();
	public List<Integer> preorder(Node root) {
		if(root!=null){
			res.add(root.val);
			for(Node node:root.children){
				preorder(node);
			}
		}
		return res;
	}
}
