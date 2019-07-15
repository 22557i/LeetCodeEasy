package lcwu;

public class Solution558 {
	public Node intersect(Node quadTree1, Node quadTree2) {
		if (quadTree1.isLeaf) {
			return quadTree1.val ? quadTree1 : quadTree2;
		} else if (quadTree2.isLeaf) {
			return quadTree2.val ? quadTree2 : quadTree1;
		}
		// Recurse in all 4 directions.
		Node tl = intersect(quadTree1.topLeft, quadTree2.topLeft);
		Node tr = intersect(quadTree1.topRight, quadTree2.topRight);
		Node bl = intersect(quadTree1.bottomLeft, quadTree2.bottomLeft);
		Node br = intersect(quadTree1.bottomRight, quadTree2.bottomRight);
		// Detect a merger state when all 4 leaves have same value.
		if (tl.isLeaf && tr.isLeaf && bl.isLeaf && br.isLeaf && tl.val == tr.val && bl.val == br.val && tl.val == bl.val) {
			return new Node(tl.val, true, null, null, null, null);
		} else {
			return new Node(false, false, tl, tr, bl, br);
		}
	}
}
