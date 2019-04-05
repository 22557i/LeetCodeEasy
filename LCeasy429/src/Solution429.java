import java.util.List;
import java.util.*;

public class Solution429 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>>ret = new ArrayList<>();
        if(root == null) return ret;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer>layer = new ArrayList<>();
            Queue<Node>temp = new LinkedList<>();

            while(!queue.isEmpty()){
                Node front = queue.poll();
                layer.add(front.val);

                for(Node nd: front.children) temp.offer(nd);
            }

            ret.add(layer);
            queue.addAll(temp);
        }

        return ret;
    }
}
