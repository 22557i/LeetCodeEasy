package Homework3;

import java.util.Stack;

public class Requirement1 {

    public static int factorial(int n){
       if(n<=1)return 1;
       else return factorial(n-1)*n;
    }
    public static int FibonacciRecursive(int n){
        if(n==1||n==2)return 1;
        else return (FibonacciRecursive(n-1))+FibonacciRecursive(n-2);
    }
    public static int FibonacciIterative(int n){
        if(n==1||n==2)return 1;
        int prev =1;
        int cur=1;
        int res = 0;
        while(n>2){
             res = prev+cur;
             prev = cur;
             cur = res;
             n--;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(factorial(6));
        System.out.println(FibonacciRecursive(5));
        System.out.println(FibonacciIterative(5));
    }
}
