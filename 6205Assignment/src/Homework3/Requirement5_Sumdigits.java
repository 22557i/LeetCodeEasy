package Homework3;

/**
 * Created by Hao Wu on 9/24/19.
 */
public class Requirement5_Sumdigits {
    public static int sumDigits(int n){
        if(n<0)throw new IllegalArgumentException();
        if(n<10)return n;
        else return (sumDigits(n/10))+n%10;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(26497));
        System.out.println(sumDigits(2122));
        System.out.println(sumDigits(-1));
    }
}
