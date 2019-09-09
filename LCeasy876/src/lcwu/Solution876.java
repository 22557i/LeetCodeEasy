package lcwu;

import java.util.ArrayList;

public class Solution876 {
	ArrayList<ListNode>list = new ArrayList<>();
	public ListNode middleNode(ListNode head) {
		while(head!=null){
			list.add(head);
			head=head.next;
		}
		int size = list.size();
		return list.get(size/2);
	}
}
