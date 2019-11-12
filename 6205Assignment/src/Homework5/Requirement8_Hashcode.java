package Homework5;

/**
 * Created by Hao Wu on 10/8/19.
 */
public class Requirement8_Hashcode {

    public static int hashCode(String s) {
            int h = 0;
            if (h == 0 && s.length() > 0) {
                char val[] = s.toCharArray();

                for (int i = 0; i < s.length(); i++) {
                    h = 31 * h +(int) val[i];
                    System.out.println((char)val[i]+" "+(int)val[i]+":" +h);
                }
            }
            return h;
    }

    public static void main(String[] args) {
        String s  ="Hello Sunny day";
        System.out.println("The hashcode written by System is: "+s.hashCode());
        System.out.println("The hashcode written by me is: "+hashCode(s));
        System.out.println();
//        char[]set = s.toCharArray();
//        for (char c :set){
//            System.out.println(c+" "+(int)c);
//        }
    }
}
