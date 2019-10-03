package Homework4;

/**
 * Created by Hao Wu on 9/30/19.
 */
import java.util.*;
public class TestLinkedListQueue<T> {
    LinkedList<T> data = new LinkedList<>();
    public void enQueue(T v) {
        data.offer(v);
    }
    public T peek() {
        return data.peek();
    }
    public T element() {
        return data.element();
    }

    public T Dequeue() {
        return data.poll();
    }

    public T remove() {
        return data.remove();
    }
    public boolean isEmpty() {
        return data.isEmpty();
    }

    public static void main(String[] args) {
        TestLinkedListQueue<Integer>test = new TestLinkedListQueue<>();
        test.enQueue(1);
        test.enQueue(2);
        test.enQueue(3);
        test.enQueue(4);
        System.out.println(test.Dequeue());
        System.out.println("---------------");
        test.enQueue(5);
        while (!test.isEmpty()){
            System.out.println(test.Dequeue());
        }
    }
}
