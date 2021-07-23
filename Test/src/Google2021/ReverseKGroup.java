package Google2021;

import Google2021.DataStructure.ListNode;

public class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k){
        ListNode cur = head;
        ListNode ktail = null;
        ListNode newHead = null;

        while(cur!=null){

            int count = 0;
            cur = head;
            while (count<k&&cur!=null){
                cur = cur.next;
                count++;
            }
            if(count == k){
                ListNode reverseHead = this.reveserKHelper(head, k);
                if(newHead==null)newHead=reverseHead;
                if(ktail!=null)ktail.next=reverseHead;
                ktail = head;
                head = cur;
            }


        }
        if(ktail!=null)ktail.next=head;
        return newHead==null?head:newHead;
    }

    public ListNode reveserKHelper(ListNode head, int k){
        ListNode pre = null;
        ListNode cur = head;
        while(k>0){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
            k--;
        }
        return pre;
    }
}
