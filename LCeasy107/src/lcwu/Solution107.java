package lcwu;
import java.util.*;
public class Solution107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null)
            return new LinkedList();
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.add(root);
        LinkedList<List<Integer>> res=new LinkedList<List<Integer>>();
        while(!queue.isEmpty())
        {
            int n=queue.size();
            LinkedList<Integer> l=new LinkedList<>();
            for(int i=0;i<n;i++)
            {
                TreeNode temp=queue.poll();
                l.add(temp.val);
                if(temp.left!=null)
                    queue.add(temp.left);
                if(temp.right!=null)
                    queue.add(temp.right);
            }
            res.addFirst(new LinkedList(l));
        }
        return res;
    }
}
