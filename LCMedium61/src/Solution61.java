/**
 * Created by Hao Wu on 10/17/19.
 */
public class Solution61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||k==0)return head;
        ListNode pre=head;
        ListNode cur = head;
        int length =0;
        while (cur!=null){
            cur = cur.next;
            length++;
        }
        k = k%length;
        if(length==1||k==0)return head;
        k= length-k;
        cur = head;
        int i =0;
        while(i<k){
            pre=cur;
            cur = cur.next;
            i++;
        }
        ListNode dummyhead = new ListNode(-1);
        dummyhead.next = cur;
        pre.next = null;
        while (cur!=null&&cur.next!=null){
            cur=cur.next;
        }
        cur.next = head;
        return dummyhead.next;
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
    }
}
