package lcwu;

public class Solution100 {

        public boolean isSameTree(TreeNode p, TreeNode q) {
            if(p==null&&q==null){
                return true;
            }
            if(p==null||q==null){
                return false;
            }
            if(p!=null&&q!=null&&p.val!=q.val){
                return false;
            }

            boolean flag1 = isSameTree(p.left,q.left);


            boolean flag2 = isSameTree(p.right,q.right);


            if(flag1==false||flag2==false){
                return false;
            }

            return true;
        }
    }

