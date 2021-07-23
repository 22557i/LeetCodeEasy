package quiz2019Fall.Quiz4Morning;

/**
 * Created by Hao Wu on 10/18/19.
 */
public class Q1 {
     int a = 50;
     int b = 10;
    public static void main(String[] args) {
        Q1 q = new Q1();
        q.a += q.b--;
        System.out.print(q.a+" ");
        System.out.println(q.b);
    }
}
