package lcwu;

public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
   if(head==null)return null;
    ListNode min = new ListNode(Integer.MIN_VALUE);
    min.next = head;
    remove(head);


return min.next;
    }
    void remove(ListNode a) {
        if (a.next != null) {
            if (a.next.val == a.val) {
                a.next = a.next.next;
                remove(a);
            } else remove(a.next);
        }
    }
}
