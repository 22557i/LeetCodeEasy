package Google1213;

/**
 * Created by Hao Wu on 12/13/19.
 */
public class Solution {
}
class TreeNode{
    TreeNode left;
    TreeNode right;
    TreeNode previous;
}
class anotherSolution {
    public void connect(TreeNode root) {
        if (root == null) return;
        TreeNode start = root;
        TreeNode cur;

        while (start != null) {
            cur = start;
            while (cur != null) {
                if (cur.right != null && cur.left != null) {
                    cur.right.previous = cur.left;
                    TreeNode temp = cur.previous;
                    while (temp != null) {
                        if (temp.right != null) {
                            if (cur.left != null) {
                                cur.left.previous = temp.right;
                                break;
                            }

                            if (cur.right != null) {
                                cur.left.previous = temp.right;
                                break;
                            }
                        }
                        if (temp.left != null) {
                            if (cur.left != null) {
                                cur.left.previous = temp.left;
                                break;
                            }
                            if (cur.right != null) {
                                cur.left.previous = temp.left;
                                break;
                            }
                        }
                        temp = temp.previous;
                    }
                    cur = temp;
                }
                while (start.left == null && start.right == null) start = start.previous;
                if (start.right != null) start = start.right;
                else start = start.left;

            }
        }
    }
}
