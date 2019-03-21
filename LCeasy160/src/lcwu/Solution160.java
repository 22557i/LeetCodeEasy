package lcwu;

import java.util.*;

public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode>s = new HashSet<>();
        while(headA!=null){
            s.add(headA);
            headA=headA.next;
        }
        while(headB!=null){
            if(s.contains(headB))return headB;
            else headB=headB.next;
        }
        return null;
    }
}
