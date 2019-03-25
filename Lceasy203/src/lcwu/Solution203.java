package lcwu;

public class Solution203 {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode pre = new ListNode(Integer.MIN_VALUE);

        pre.next = head;
        while (head.next != null) {
            if (head.val == val) pre.next = head.next;
            else if (head.next.val == val) {
                head.next = head.next.next;
            }
        }
        return pre.next;
    }
}
/*if(head ==null)return null;
    head.next = removeElements(head.next,val);
    return head.val==val?head.next:head;
 */