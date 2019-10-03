package Homework4;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Created by Hao Wu on 10/1/19.
 */
public class Requirement7 {

    public static class UnorderQueue{
        private int data [] = new int[0];
        int size=0;
        public void setData(int[] a){
            size=a.length;
            this.data = a;
        }
        public int[] getData(){
            return this.data;
        }
        public boolean isEmpty(){
            return size==0;
        }

        public int size(){
            return size;
        }
        public void enqueue(int t){
            int temp[] = new int[++size];
            for (int i = 0; i < size-1; i++) {
                temp[i] = data[i];
            }
            temp[size-1]=t;
            data = temp;
        }
        public int dequeue(){
            for (int i = 0; i <size-1 ; i++) {
                if(data[i]<data[i+1]){
                    int temp = data[i];
                    data[i] = data[i+1];
                    data[i+1] = temp;
                }
            }
            int res = data[--size];
            int newdata[] = new int[size];
            for (int i = 0; i <size ; i++) {
                newdata[i] = data[i];
            }
            data = newdata;
            return res;

        }
        public int peek(){
            int res = Integer.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                res=Math.min(res,data[i]);
            }
            return res;
        }

    }
    public static class OrderQueue{
        private int[]data = new int[0];
        int size=0;
        public void setData(int[]  t){
            size= t.length;
            Arrays.sort(t);
            this.data =t;
        }
        public int[] getData(){
            return this.data;
        }
        public int size(){
            return size;
        }
        public boolean isEmpty(){
            return size==0;
        }
        public void enqueue(int t){
            int newdata[] = new int[++size];
            for (int i = 0; i <size-1 ; i++) {
                newdata[i] = data[i];
            }
            newdata[size-1]=t;
            data = newdata;
            Arrays.sort(data);
        }
        public int dequeue(){
            int temp = data[0];
            int newdata []= new int[--size];
            for (int i = 1; i <=size ; i++) {
                newdata[i-1]=data[i];
            }
            data = newdata;
            return temp;
        }
    }

    public static void main(String[] args) {
        int data[] = {3, 10, 5, 12, 20, 9, 24, 41, 6, 11, 50, 31, 24, 14};
        UnorderQueue uq = new UnorderQueue();
        OrderQueue oq = new OrderQueue();
        for (int n:data) {
            uq.enqueue(n);
            oq.enqueue(n);

        }

        for (int n:uq.getData()){
            System.out.print(n+" ");
        }
        System.out.println();
        while(!uq.isEmpty()){
            System.out.print(uq.dequeue()+",");
        }
        System.out.println("-------------------------------------------");
        for (int n:oq.getData()){
           System.out.print(n+" ");
        }
        System.out.println();
        while(!oq.isEmpty()){
            System.out.print(oq.dequeue()+",");
        }
    }
}
