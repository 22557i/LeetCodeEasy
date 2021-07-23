package Google2021;

import Google2021.DataStructure.ListNode;

public class ReverseLinkedList {
    public ListNode reverList(ListNode head)  {
        ListNode pre = null;
        ListNode cur = head;

        while(cur!=null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
