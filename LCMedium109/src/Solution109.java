import com.sun.tools.corba.se.idl.InterfaceGen;

import java.util.ArrayList;

/**
 * Created by Hao Wu on 11/11/19.
 */
import java.util.*;
public class Solution109 {
    private List<Integer>list = new ArrayList<>();
    public TreeNode sortedListToBST(ListNode head) {
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        return tb(0,list.size()-1);
    }
    public TreeNode tb(int left, int right){
        if(left>right){
            return null;
        }
        int mid = left +(right-left)/2;
        TreeNode node = new TreeNode(list.get(mid));
        if(left==right)return  node;

        node.left = tb(left,mid-1);
        node.right = tb(mid+1,right);
        return node;
    }

}
 class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }



class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
