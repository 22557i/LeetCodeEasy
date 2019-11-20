package Java1113;

import java.util.*;

/**
 * Created by Hao Wu on 11/19/19.
 */

public class myQueue {
    int []data = new int[0];
    int rear = -1;

    public void offer(int x){
        int temp[] = new int[this.data.length+1];
        for(int i =0;i<this.data.length;++i){
            temp[i] = this.data[i];
        }
        temp[rear++] = x;
        this.data = temp;
    }
    public int poll(){
        if(this.data.length<=0)throw new ArrayIndexOutOfBoundsException();
        int res = this.data[0];
        int temp[] = new int[this.data.length-1];
        for(int i=0;i<temp.length;i++){
            temp[i] = this.data[i+1];
        }
        this.data = temp;
        rear--;
        return res;
    }
    public int peek(){return this.data[0];}

    public static void main(String[] args) {


    }
}
