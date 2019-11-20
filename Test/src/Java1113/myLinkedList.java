package Java1113;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Hao Wu on 11/19/19.
 */
public class myLinkedList {
    private Node head;
    private int size = 0;
    public void add(int x){
        if(head ==null){head = new Node(x);

        }
        else{
            Node cur = head;
            while(cur.next!=null){
                cur = cur.next;
            }
            cur.next = new Node(x);
        }
        size++;

    }
    public int get(int index){
        if(index>=size||index<0)throw new ArrayIndexOutOfBoundsException();

        int i= 0;
        Node cur = head;
        while(cur!=null&&i<index){
            cur= cur.next;
            i++;
        }
        return cur.data;

    }
    public boolean contains(int n){
        Node cur = head;
        while(cur!=null){
            if(cur.data==n)return true;
            cur = cur.next;
        }
        return false;
    }
    public static void main(String[] args) {
        List<Integer> l = new LinkedList<>();

    }
}
class Node{
    int data;
    Node next;
    Node(int x){this.data = x;}
}