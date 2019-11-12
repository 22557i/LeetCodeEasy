
import java.util.*;

/**
 * Created by Hao Wu on 10/23/19.
 */
public class Solution501 {
    Map<Integer,Integer> map=new HashMap<>();
    int max=1;

    public int[] findMode(TreeNode root) {
        //Calling helper to populate the map with
        helper(root);

        //finding the number of nodes that have max frequency
        int size=0;
        for(int num: map.keySet()){
            if(map.get(num)==max){
                size++;
            }
        }
        //loop through the map and add all nodes that are equal to max
        int[] arr=new int[size];
        int i=0;
        for(int num: map.keySet()){
            if(map.get(num)==max){
                arr[i]=num;
                i++;
            }
        }


        return arr;
    }

    //Storing all nodes with their frequency in the HashMap
    public void helper(TreeNode root){
        if(root==null) return ;
        helper(root.left);
        helper(root.right);
        int val=root.val;
        if(!map.containsKey(val)){
            map.put(val,1);

        }else{

            map.put(val,map.get(val)+1);
            if(map.get(val)>max){
                max=map.get(val);
            }

        }
    }

}
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
     TreeNode(int x) { val = x; }
  }