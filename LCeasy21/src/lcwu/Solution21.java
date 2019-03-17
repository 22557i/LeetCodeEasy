package lcwu;

class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode A = new ListNode(-1);
        ListNode B =A;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                B.next=l1;
                l1=l1.next;
            }else
            {
                B.next=l2;
                l2=l2.next;
            }B=B.next;

        }
        if(l1!=null)B.next=l1;
        if(l2!=null)B.next=l2;
        return A.next;
    }

}