package HUAWEI1223;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);

        //String s = sc.next();
       // String temps[] = s.split(",");
//        int n = Integer.valueOf(temps[0]);
//        int x = Integer.valueOf(temps[1]);
//        int y = Integer.valueOf(temps[2]);
        int n =6;
        int x =3;
        int y =1;
        int res = 0;
        while(n>x){
            n-= x-y;
            res+=5;
            System.out.println(n);
        }
        if(5*n%x==0) System.out.println(res+ 5*n/x);
        else System.out.println(1+res+ 5*n/x);
    }
}
