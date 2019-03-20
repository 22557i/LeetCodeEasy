package lcwu;

public class Solution110 {
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        return height(root)!=-1;

    }
    public int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int leftH=height(node.left);
        if(leftH==-1){
            return -1;
        }
        int rightH=height(node.right);
        if(rightH==-1){
            return -1;
        }
        if(leftH-rightH<-1 || leftH-rightH>1){
            return -1;
        }
        return Math.max(leftH,rightH)+1;
    }
}
