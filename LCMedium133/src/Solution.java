/**
 * Created by Hao Wu on 10/1/19.
 */
import java.util.*;
public class Solution {
    class Node{
        public int val;
        public List<Node>neighbors;

        public Node(int _val,List<Node>_neighbors){
            val = _val;
            neighbors = _neighbors;
        }
    }
    Map<Node,Node>map = new HashMap<>();
    public Node cloneGraph(Node node){
        Node clonenode = new Node(node.val,new ArrayList<Node>());
        map.put(node,clonenode);
        for(Node n:node.neighbors){
            if(map.get(n)==null){
                cloneGraph(n);
            }
            clonenode.neighbors.add(map.get(n));
        }
        return clonenode;
    }
}
