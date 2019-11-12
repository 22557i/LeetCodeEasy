package Homework6;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Hao Wu on 10/14/19.
 */
public class Q5 {
    static int[]data = {30,40,23,58,48,26,11,13};
    static Queue<TreeNode> list = new LinkedList<>();
    public static void main(String[] args) {
        TreeNode root = new TreeNode(data[0]);
        for (int i = 1; i <data.length ; i++) {
            TreeNode newnode = new TreeNode(data[i]);
            TreeNode curr = root;
            while (curr!=null){
                if(data[i]>=curr.val){
                    if(curr.right==null) {
                        curr.right = newnode;
                        break;
                    }else{
                        curr=curr.right;
                    }

                }else {
                    if(curr.left==null) {
                        curr.left = newnode;
                        break;
                    }else{
                        curr=curr.left;
                    }
                }
            }
        }
        midorder(root);
        for(TreeNode n : list){
            System.out.println(n.val);
        }
    }
    public static void midorder(TreeNode root){
        if(root==null)return;
        else {
            midorder(root.left);
            list.add(root);
            midorder(root.right);
        }
    }
}
