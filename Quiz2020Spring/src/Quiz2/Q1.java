package Quiz2;

/**
 * Created by Hao Wu on 1/30/20.
 */
public class Q1 {
}
class StringObj{

    public static void main(String []args){

        String a = "abc";

        String b = new String("abc");

        String c = "abc";

        System.out.println(a.equals(b));

        System.out.println(a==b);

        System.out.println(a==c);

    }

}