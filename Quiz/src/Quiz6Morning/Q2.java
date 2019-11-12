package Quiz6Morning;

/**
 * Created by Hao Wu on 10/30/19.
 */
public class Q2 {
    public static void main(String[] args) { System.out.println("The final value: " + test()); }

    public static int test() {
        int i = 10;
        try {
            System.out.println("In the try block: " + i++);
            i = i / 0;
            ++i;
        }
        catch (Exception e){
            System.out.println("In the catch block: " + i);
            return ++i;
        }
        finally {
            System.out.println("In the finally block: " + i);
            return i++;
        }

    }
}
