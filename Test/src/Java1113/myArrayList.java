package Java1113;

import java.util.ArrayList;

/**
 * Created by Hao Wu on 11/12/19.
 */
public class myArrayList {
    private int[] data;
    private int size;
    public myArrayList(){
        this.data = new int[0];
        this.size=0;
    }
    public void add(int n){
        int temp[] = new int[++size];
        for(int i =0;i<size-1;++i){
            temp[i] = this.data[i];
        }
        temp[size-1]=n;
        this.data = temp;
    }
    public void remove(int index){
        if(index>=size||index<0)throw new ArrayIndexOutOfBoundsException();
        int temp[] = new int[--size];
        for(int i =0;i<index;++i){
            temp[i] = this.data[i];
        }
        for (int i = index; i <size ; i++) {
            temp[i] = this.data[i+1];
        }
        this.data =temp;
    }
    public int size(){
        return this.size;
    }
    public int get(int index){
        return this.data[index];
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean contains(int n){
        for (int t:this.data){
            if(t==n)return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int n:this.data){
            sb.append(n).append(",");
        }
        return sb.substring(0,sb.length()-1)+"]";

    }

    public static void main(String[] args) {
        myArrayList mlist = new myArrayList();
        mlist.add(1);
        mlist.add(2);
        mlist.add(4);
        mlist.add(3);
        mlist.add(5);
        System.out.println(mlist);
//        1.add  (int n)
//            2.remove(int index)
//        3.size()
//            4.get(int index)
//        5.isEmpty
//            6.contains(int n)
    }
}
