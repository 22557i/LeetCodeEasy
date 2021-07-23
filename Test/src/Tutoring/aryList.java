package Tutoring;

import java.util.ArrayList;

public class aryList {
    private int[] data = new int[0];
    private int size = 0;
    public int getSize(){
        return this.size;
    }
    public boolean isEmpty(){
        return getSize()==0;
    }
    public void add(int e){
        int temp[] = new int[++size];
        for(int i=0;i<size-1;i++)
            temp[i] = this.data[i];
        temp[size-1] = e;
        this.data = temp;
    }
    public void print(){
        for (int n: data
             ) {
            System.out.print(n+" ");
        };
    }
    public boolean contains(int e){
        for (int n:data
             ) {
            if(n==e)return true;
        }
        return false;
    }
    public static void main(String[] args) {
        aryList l = new aryList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.print();
        ArrayList l1 = new ArrayList();
        
    }

}
