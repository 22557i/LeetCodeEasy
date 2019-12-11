package BasicAlgorithms;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Hao Wu on 11/8/19.
 */
public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int x ){
        this.data = x;
    }
}
class algorithm{
    public void Dfs(TreeNode root){
        if(root == null)return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.println(temp.data);
            if(temp.right!=null)stack.push(root.right);
            if(temp.left!=null)stack.push(root.left);
        }
    }
    public void bfs(TreeNode root){
        if(root==null)return;
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();

        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode t = queue.remove();
            System.out.println(t.data);
            if(t.left!=null) queue.add(t.left);
            if(t.right!=null) queue.add(t.right);
        }
    }
}
