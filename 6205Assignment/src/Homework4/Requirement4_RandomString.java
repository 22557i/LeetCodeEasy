package Homework4;

import java.util.Random;

/**
 * Created by Hao Wu on 9/30/19.
 */
public class Requirement4_RandomString {
    public static String getRandomString(int length){
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(127);
            sb.append((char)number);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String result = getRandomString(500);
        System.out.println(result);
        long startTime = System.currentTimeMillis();
        reverseByString(result,200000);

        long endTime = System.currentTimeMillis();
        System.out.println("running time is " + (endTime - startTime) + "ms");
        startTime = System.currentTimeMillis();
        reverseByStringBuilder(result,200000);

        endTime = System.currentTimeMillis();
        System.out.println("running time is " + (endTime - startTime) + "ms");
    }
    public static void reverseByString(String s, int n){

        for (int i = 0; i <n ; ++i) {
            String res = "";
            for (int j = s.length()-1; j>-1 ; --j) {
                res+=s.charAt(j);
            }
        }

    }
    public static void reverseByStringBuilder(String s , int n){
        for (int i = 0; i <n ; i++) {
            String res= new StringBuilder(s).reverse().toString();
        }
    }

}
