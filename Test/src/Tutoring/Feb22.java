package Tutoring;

import java.util.*;

public class Feb22 {

    private int data[] = new int[0];
    private int size = 0;
    private void push(int n){
        int temp[] = new int[++size];
        for (int i = 0;i<data.length-1;i++){
            temp[i] = data[i];
        }
        temp[size-1] = n;
        this.data = temp;
    }

    private int pop(){
        int res = this.data[size-1];
        int temp[] = new int[--size];
        for (int i =0;i<size;i++)
            temp[i] = this.data[i];

        this.data  = temp;
        return res;
    }
    public int peek(){
        return this.data[size-1];
    }
    public static void main(String[] args) {


    }
}
