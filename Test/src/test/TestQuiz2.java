package test;

import java.util.Arrays;

/**
 * Created by Hao Wu on 10/2/19.
 */
public class TestQuiz2 {
    static class Person {
        String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void print() {
        Person p1 = new Person();
        p1.setName("name-1");
        Person p2 = p1;
        p2.setName("name-2");
        System.out.println(p1.getName());
        System.out.println(p2.getName());
    }

    public static void main(String[] args) {
        //divide(4,0);

        int test[] = {1,2,3,6,4,5};
        int test1[] = {1,6,5,4,9,7,2,4,3,3,6};
        int test2[] ={2,4,4,5,1,61,61,6,12,4,1,51,6,72,2,4,5,23};
        int test3[] = {252,12,1215,62,366,634,234,737,124,121,634,75};
        System.out.println(findindex(test));
        System.out.println(findindex(test1));
        System.out.println(findindex(test2));
        System.out.println(findindex(test3));
        for(int n:test2){
            System.out.print(n+" ");
        }
        System.out.println();
        for(int n:test3){
            System.out.print(n+" ");
        }
    }
    public static  int divide(int a, int b){
        int c = -1;
        try {
            c = a / b;
        }catch (Exception e){
            System.err.print("Exception ");
        }finally {
            System.err.print("Finally");
        }
        return c;

    }
    public static int findindex(int[]nums){
        for (int i = 1; i <nums.length ; i++) {
            if(Arrays.stream(Arrays.copyOfRange(nums,0,i)).sum()>=Arrays.stream(Arrays.copyOfRange(nums,i+1,nums.length)).sum()){
                return i-1;
            }
        }
        return -1;

    }
}