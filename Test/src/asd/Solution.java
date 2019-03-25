package asd;

import java.util.ArrayList;

public class Solution {
    public void show() {
        ArrayList<Integer>list = new ArrayList<Integer>();
        list.add(4);
        list.add(7);
        list.add(1);
        for(int a:list){
            System.out.println(a);

        }

    }
    public static void main(String args[]){
      String s1 = new String("Hello World");
      String s2 = new String("Hello World");
      String s3 = "Hello World";
      String s4 = "Hello World";
      int a =0, b=0,c=0;
      if(s3==s4){
          a=1;
      }else{
          a=2;
      }
      if(s1.equals(s3)){
          b=1;
      }else b=2;
      if(s1==s4){
          c=1;
      }else c=2;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
