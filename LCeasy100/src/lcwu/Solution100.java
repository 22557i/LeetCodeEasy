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

            boolean falg1 = isSameTree(p.left,q.left);


            boolean falg2 = isSameTree(p.right,q.right);


            if(falg1==false||falg2==false){
                return false;
            }

            return true;
        }
    }

