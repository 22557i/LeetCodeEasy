package Homework4;

/**
 * Created by Hao Wu on 10/1/19.
 */
public class Requriement6 {
    public static class Queue1<T> {
        private T data[];
        private int size;
        private int max;

        Queue1(int n) {
            data = (T[]) new Object[n];
            max = n;
            size = 0;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return max == size;
        }

        public void enQueue(T t) {
            if (isFull()) throw new ArrayIndexOutOfBoundsException();
            data[size++] = t;
        }

        public T deQueue() {
            T temp = data[0];
            T newdata[] = (T[]) new Object[max];
            for (int i = 0; i < size - 1; i++) {
                newdata[i] = data[i + 1];
            }
            data = newdata;
            size--;
            return temp;
        }

        public T peek() {
            if (isEmpty()) throw new NullPointerException();
            return data[0];
        }

        public int size() {
            return this.size;
        }

        @Override
        public String toString() {
            String s = "";
            for (int i = 0; i < size - 1; i++) {
                s += data[i];
                s += ',';
            }
            s += data[size - 1];
            return s;
        }
    }
    public static class Queue2<T>{
        private T data[];
        private int size;
        private int max;
        Queue2(int n){
            data = (T[])new Object[n];
            max= n;
            size =0;
        }
        public boolean isEmpty(){
            return size ==0;
        }
        public boolean isFull(){
            return size==max;
        }
        public T peek(){
            if(isEmpty())throw new NullPointerException();
            else return data[size-1];
        }
        public void enQueue(T t){
            if(isFull())throw new ArrayIndexOutOfBoundsException();
            else{
                for (int i = size; i >=1 ; --i) {
                     data[i]=data[i-1];
                }
                data[0]=t;
                size++;

            }
        }
        public T deQueue(){
            if(isEmpty())throw new NullPointerException();
            T temp = peek();
            data[size---1] = null;
            return temp;
        }
        public int size(){
            return this.size;
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
    }



    public static void main(String[] args) {
       Queue1<Integer>test = new Queue1<>(10);
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
        System.out.println("------------------------------");
        Queue2<Integer>test2 = new Queue2<>(10);
        test2.enQueue(1);
        System.out.println(test2);
        test2.enQueue(2);
        System.out.println(test2);
        test2.enQueue(3);
        System.out.println(test2);
        test2.enQueue(4);
        System.out.println(test2.deQueue());
        System.out.println(test2);
        test2.enQueue(5);
        System.out.println(test2);
    }
}
