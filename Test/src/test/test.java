package test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Hao Wu on 10/6/19.
 */
public class test {
    private int i;
    test(){
        i=0;
    }
    public void change(){
        i++;
    }
    public int change(int a){
        i = i+a;
        return i;
    }
    public int getI(){
        return  this.i;
    }
    public void printi(){
        this.change();
        System.out.println(this.getI());
    }
    public static void main(String[] args) {

        test t1 = new test();
        t1.change();
        System.out.println(t1.getI());
        t1.change(3);
        System.out.println(t1.getI());
    }
}
