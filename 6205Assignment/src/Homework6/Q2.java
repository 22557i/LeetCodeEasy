package Homework6;

import java.util.LinkedList;
import java.util.*;

/**
 * Created by Hao Wu on 10/14/19.
 */
public class Q2 {
    public static final int[]data={3,7,9,23,45,1,5,14,55,24,13,11,8,19,4,31,35,56};

    private static TreeNode createBinaryTreeByArray(int []array,int index)
    {
        TreeNode tn = null;
        if (index<array.length) {
            int value = array[index];

            tn = new TreeNode(value);
            tn.left = createBinaryTreeByArray(array, 2*index+1);
            tn.right = createBinaryTreeByArray(array, 2*index+2);
            return tn;
        }
        return tn;
    }
    public static void preorder(TreeNode root,List list){
        if(root==null)return;
        else{
            preorder(root.left,list);
            list.add(root);
            preorder(root.right,list);
        }
    }
    public static TreeNode searchNode(List<TreeNode> list,int val){

        for (TreeNode n:list){
            if(val==n.val)return n;
        }
        return null;
    }
    public static void InsertNode(List<TreeNode> list,TreeNode node){
        for(TreeNode n:list){
            if(n.left!=null){
                n.left=node;
                break;
            }
            if(n.right!=null){
                n.right = node;
                break;
            }
        }
        list.add(node);
    }
    public static void display(List<TreeNode> list){
        for(TreeNode n:list){
            System.out.print(n.val+",");
        }
    }
    public static void display(TreeNode root){
        if(root!=null) {
            System.out.print(root.val + ",");
            display(root.left);
            display(root.right);
        }



    }
    public static TreeNode deleteMin(List<TreeNode>list) {
        int min = Integer.MAX_VALUE;
        for (TreeNode n : list) {
            min = Math.min(n.val, min);
        }
        for (TreeNode n : list) {
            if (n.val == min) {
                TreeNode left = n.left;
                TreeNode right = n.right;
                for (TreeNode c : list) {
                    if(c.left!=null)
                    if (c.left.val == min) {
                        c.left = left;
                        for (TreeNode t : list) {
                            if (t.left == null) {
                                t.left = right;
                                break;
                            }
                            if (t.right == null) {
                                t.right = right;
                                break;
                            }
                        }
                        break;

                    }
                    if(c.right!=null)
                    if (c.right.val == min) {
                        c.right = left;
                        for (TreeNode t : list) {
                            if (t.left == null) {
                                t.left = right;
                                break;
                            }
                            if (t.right == null) {
                                t.right = right;
                                break;
                            }
                        }
                        break;
                    }
                }
                list.remove(n);
               return  n;
            }
        }
        return null;
    }
    public static TreeNode deleteMax(List<TreeNode>list) {
        int max = Integer.MIN_VALUE;
        for (TreeNode n : list) {
           max = Math.max(n.val, max);
        }
        for (TreeNode n : list) {
            if (n.val == max) {
                TreeNode left = n.left;
                TreeNode right = n.right;
                for (TreeNode c : list) {
                    if(c.left!=null)
                        if (c.left.val == max) {
                            c.left = left;
                            for (TreeNode t : list) {
                                if (t.left == null) {
                                    t.left = right;
                                    break;
                                }
                                if (t.right == null) {
                                    t.right = right;
                                    break;
                                }
                            }
                            break;

                        }
                    if(c.right!=null)
                        if (c.right.val == max) {
                            c.right = left;
                            for (TreeNode t : list) {
                                if (t.left == null) {
                                    t.left = right;
                                    break;
                                }
                                if (t.right == null) {
                                    t.right = right;
                                    break;
                                }
                            }
                            break;
                        }
                }
                list.remove(n);
                return  n;
            }
        }
        return null;
    }
    public static void main(String[] args) {
       TreeNode root =  createBinaryTreeByArray(data,0);
        List<TreeNode>list = new LinkedList<>();
        preorder(root,list);
        display(root);
        System.out.println();
        System.out.println(searchNode(list,55).val);
        InsertNode(list,new TreeNode(25));
        display(root);
        deleteMin(list);
        System.out.println();
        display(root);
        deleteMax(list);
        System.out.println();
        display(root);


    }

}
