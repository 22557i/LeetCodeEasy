package Homework3;

/**
 * Created by Hao Wu on 9/24/19.
 */
public class Requirement6_CountStringBinary {
    public static int countStringBinary(int n){
        return countBinary((int)Math.pow(2,n)-1,n);
}
    public static int countBinary(int n,int k){
        if(n<4)return 0;
        String s = Integer.toBinaryString(n);
        if(s.length()<k){
            for (int i = 0; i <k-s.length() ; i++) {
                s="0"+s;
            }
        }
        System.out.println(s);
        if(!s.contains("00"))return countBinary(n-1,k)+1;
        else return countBinary(n-1,k);
    }
    public static void main(String[] args) {
        System.out.println(countStringBinary(4));
    }
}
