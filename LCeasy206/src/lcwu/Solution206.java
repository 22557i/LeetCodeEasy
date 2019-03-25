package lcwu;

import sun.jvm.hotspot.oops.InstanceKlass;

import java.util.Stack;

public class Solution206 {
    public ListNode reverseList(ListNode head){
        if(head==null)return null;
        Stack<ListNode> sln= new Stack<ListNode>();
        while(head.next!=null){
            sln.push(head);
            head=head.next;
        }
        ListNode pre = new ListNode(0);
        ListNode cur = sln.pop();
        pre.next = cur;
        while(!sln.isEmpty()){
            cur=sln.pop();
            cur.next=cur;
        }
        return pre.next;
    }

}
/*
*   ListNode prev = null;
    ListNode curr = head;
    while (curr != null) {
        ListNode nextTemp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nextTemp;
    }
    return prev;*/