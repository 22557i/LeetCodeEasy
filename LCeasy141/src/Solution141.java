import java.util.*;

public class Solution141 {
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null)return false;
        Set<ListNode>t=new HashSet<>();
        while(head.next!=null){
            if(t.contains(head))return true;
            else t.add(head);
            head=head.next;
        }
        return false;

    }
}
