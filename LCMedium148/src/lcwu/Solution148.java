package lcwu;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by Hao Wu on 11/11/19.
 */
public class Solution148 {
    Queue<ListNode>q = new PriorityQueue<>((o1,o2)->o1.val-o2.val);
    public ListNode sortList(ListNode head) {
       if(head == null)return head;

       while(head!=null){
           q.offer(head);
           head = head.next;
       }

       ListNode dum = new ListNode(Integer.MIN_VALUE);
      ListNode cur;
       dum.next =cur = q.poll();
       while(!q.isEmpty()){
            cur.next = q.poll();
            cur = cur.next;
            
       }
        return  dum.next;

    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
