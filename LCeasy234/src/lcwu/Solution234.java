package lcwu;

import java.util.*;

public class Solution234 {
    public boolean isPalindrome(ListNode head){
        ListNode dummy = new ListNode(-1), slow = dummy, fast = dummy;
        dummy.next = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast.next != null) slow = slow.next;
        fast = slow.next;

        slow.next = null;
        while(fast != null) {
            dummy = fast.next;
            fast.next = slow.next;
            slow.next = fast;
            fast = dummy;
        }

        slow = slow.next;
        while(slow != null) {
            if(head.val != slow.val) return false;
            head = head.next;
            slow = slow.next;
        }

        return true;
    }
}
/*
* 蠢比方法：
*   StringBuffer s = new StringBuffer(head.val);
        while(head.next!=null){
            s.append(head.next.val);
            head=head.next;
        }

        return (s.toString()==s.reverse().toString())?true:false;*/