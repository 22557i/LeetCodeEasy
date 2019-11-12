package Homework5;

/**
 * Created by Hao Wu on 10/6/19.
 */
public class Circularqueue <T>{
    private T[] data;
    private int size=0;
    private int front;
    private int rear;

    public Circularqueue(int size) {
        data = (T[])new Object[size];

        this.front=0;
        this.rear =0;
    }
    public void enqueue(T t){
        if(!isFull()){
            data[rear++] = t;
            rear = rear%data.length;
            size++;
        }else throw new IndexOutOfBoundsException();
    }
    public T dequeue(){

        if(isEmpty())return null;
        T res = data[front];
        System.out.println("Dequeue: "+res.toString());
        front=(front+1)%data.length;
        size--;
        return res;
    }
    public T peek(){
        return data[front];
    }
    public boolean isFull(){
        return size==data.length;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void displayQueue(){
        System.out.print("[");
        if(isEmpty()){
            for (int i = 0; i <data.length-1 ; i++) {
                System.out.print("null,");
            }
            System.out.print("null");
        }
        else if(front<rear)
        for (int i=0;i<data.length;i++) {

            if(i>=front&&i<rear) System.out.print(data[i]+",");
            else System.out.print("null,");

        } else{
            for (int i = 0; i <data.length ; i++) {
                 if(i>=rear&&i<front)System.out.print("null,");
                 else   System.out.print(data[i]+",");
            }
        }
        System.out.println("]");
        System.out.println("The front pointer is: "+ front);
        System.out.println("The rear pointer is: "+ rear);
        System.out.println("The size is: "+size);

    }
    public static void main(String[] args) {
        Circularqueue<Integer>cq = new Circularqueue<>(9);
        System.out.println(cq.isEmpty());
        System.out.println(cq.isFull());
        int data[]={7, 28, 3, 9, 12, 82, 10, 31, 24};
        for(int n:data){
            cq.enqueue(n);
            cq.displayQueue();
        }
        System.out.println(cq.isEmpty());
        System.out.println(cq.isFull());
        for (int i = 0; i <3 ; i++) {
            cq.dequeue();
            cq.displayQueue();
        }
        cq.enqueue(7);
        cq.enqueue(28);
        while(!cq.isEmpty()){
            cq.dequeue();
            cq.displayQueue();
        }

    }
}
