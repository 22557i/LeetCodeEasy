package Homework4;

import java.util.Objects;

/**
 * Created by Hao Wu on 9/30/19.
 */
public class Requirement2_MyQueueByArray <T>{
    private T [] data =(T[])new Object[0];
    int top = -1;
    int size =0;
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void enQueue(T t){
        T[]temp = (T[]) new Object[++size];

        for (int i = 1; i <size ; i++) {
            temp[i]=data[i-1];
        }
        temp[0] = t;
        top++;
        data = temp;
    }
    public T deQueue(){
        T res = data[top];
        T[]temp = (T[])new Object[--size];
        for (int i = 0; i <size ; i++) {
            temp[i] = data[i];
        }
        data = temp;
        top--;
        return res;
    }
    public T peek(){
        return data[top];
    }
    @Override
    public String toString(){
        String s = "";
        for (int i = 0; i < size-1; i++) {
            s+=data[i];
            s+=',';
        }
        s+=data[size-1];
        return s;
    }
    public static void main(String[] args) {
        Requirement2_MyQueueByArray<Integer>test = new Requirement2_MyQueueByArray<>();
        test.enQueue(1);
        System.out.println(test);
        test.enQueue(2);
        System.out.println(test);
        test.enQueue(3);
        System.out.println(test);
        test.enQueue(4);
        System.out.println(test.deQueue());
        System.out.println(test);
        test.enQueue(5);
        System.out.println(test);
    }

}
