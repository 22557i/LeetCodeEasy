package quiz2019Fall.Quiz7Morning;

/**
 * Created by Hao Wu on 11/9/19.
 */
public class Q5 {
}
class Output4 {
    public static void main(String[] args) {
        try {
            System.out.printf("1");
            int data = 5 / 0;
        } catch (ArithmeticException e) {
            Throwable obj = new Throwable("Sample");
            try {
                throw obj;
            } catch (Throwable e1) {
                System.out.printf("8");
            }
        } finally {
            System.out.printf("3");
        }
        System.out.printf("4");
    }
}
