/**
 * Created by Hao Wu on 11/1/19.
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class Solution82 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode dum = new ListNode(-1);
        dum.next = head;
        ListNode pre,cur,next;
        pre = dum;
        cur = head;
        while(cur != null && cur.next != null) {
            if(cur.val == cur.next.val){
                while(cur.next != null && cur.val == cur.next.val) cur.next = cur.next.next;
                pre.next = cur.next;
                cur = pre.next;
            }
            else {
                pre = cur;
                cur = cur.next;
            }
        }
        return dum.next;

    }
}
