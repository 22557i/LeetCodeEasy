package lcwu;
<<<<<<< HEAD

import java.util.*;

=======
import java.util.*;
>>>>>>> 4940192d7c1279f7a0ec5c234d95a96101881f13
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
