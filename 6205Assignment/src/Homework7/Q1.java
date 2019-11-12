package Homework7;


import java.util.*;

/**
 * Created by Hao Wu on 10/22/19.
 */
public class Q1 {
}
class Bag<Item> implements Iterable<Item> {

    private int N;

    private Node first;

    private class Node {

        private Item item;

        private Node next;

        public Item getItem() {
            return item;
        }
    }

    public Bag(int n) {
        this.N=n;
        first=null;
    }

    public boolean isEmpty() {
        if(N == 0) {
            return true;
        }
        return false;
    }

    /**
     * 读出来的与add的相反
     * @param item
     */
    public void add(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;

    }


    private class ListIterator implements Iterator<Item> {

        private Node current=first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item=current.item;
            current=current.next;
            return item;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] agrs){
        List<Bag> list = new LinkedList<>();
        for(int i =0;i<7;++i){
            list.add(new Bag<Integer>(i));
        }
        int grid[][] = {{5,6},{4,6},{3,7},{6,7},{5,7},{1,4},{2,4},{2,3},{4,7}};
        for (int i = 0; i <grid.length ; i++) {
            list.get(grid[i][0]-1).add(grid[i][1]-1);
            list.get(grid[i][1]-1).add(grid[i][0]-1);
        }
        int n = 0;
        for(Bag b:list){
            List<Integer >templist = new ArrayList<>();
            System.out.print((++n)+"->");
            Iterator i = b.iterator();
            while (i.hasNext()){
                templist.add((int)i.next()+1);
            }
            Collections.sort(templist);
            for (int k: templist) {
                System.out.print(k+"->");
            }
            System.out.println();
        }
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

}

