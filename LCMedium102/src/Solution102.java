/**
 * Created by Hao Wu on 10/24/19.
 */
import java.util.*;
public class Solution102 {
    List<List<Integer>>result = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null)return result;
        bfs(root,0);
        return result;
    }
    public void bfs(TreeNode root,int level){
        if(level==result.size())
            result.add(new ArrayList<Integer>());
            result.get(level).add(root.val);
            if(root.left!=null)
                bfs(root.left,level+1);
            if(root.right!=null)
                bfs(root.right,level+1);
    }
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }