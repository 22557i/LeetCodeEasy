import java.util.*;

/**
 * Created by Hao Wu on 12/3/19.
 */
public class BinarySearchTree {
    private TreeNode root;

    public void insert(int key)
    {
        TreeNode p=new TreeNode(); //待插入的节点
        p.val=key;

        if(root==null)
        {
            root=p;
        }
        else
        {
            TreeNode parent=new TreeNode();
            TreeNode current=root;
            while(true)
            {
                parent=current;
                if(key==current.val)break;
                else if(key>current.val)
                {
                    current=current.right; // 右子树
                    if(current==null)
                    {
                        parent.right=p;
                        return;
                    }
                }
                else //本程序没有做key出现相等情况的处理，暂且假设用户插入的节点值都不同
                {
                    current=current.left; // 左子树
                    if(current==null)
                    {
                        parent.left=p;
                        return;
                    }
                }
            }
        }
    }
    public TreeNode binarySearchInTree(int x){
        TreeNode temp = this.root;
        while(temp!=null){
            if(temp.val==x)return temp;
            else {
                if(temp.val>x)temp = temp.left;
                else temp = temp.right;
            }
            if(temp.left==null&&temp.right==null&&temp.val==x)break;
        }
        return null;
    }

    public TreeNode getRoot() {
        return root;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        int arr[] = new int[]{3,1,5,2,5,1,2,6,5,4,2,8,7,12,15,2652,42,4231,61};
        for(int n:arr)bst.insert(n);
        bst.inOrder(bst.getRoot());
        //System.out.println(bst.list.size());
    }
    public List<TreeNode>list = new ArrayList<>();
    public void inOrder(TreeNode root){
        if(root ==null)return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        System.out.print("");
        inOrder(root.right);
    }
}
