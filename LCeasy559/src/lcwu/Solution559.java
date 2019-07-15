package lcwu;

public class Solution559 {
	public int maxDepth(Node root) {
		int max=0;
		if(root==null)return 0;
		for(Node ch:root.children){
			max=Math.max(max,maxDepth(ch));

		}
		return max+1;
	}
}
