package Quiz6Afternoon;

/**
 * Created by Hao Wu on 11/2/19.
 */
public class Q4 {
}
class Test {
    public static void main(String[] args) {
        try {
            int a[] = {1, 2, 3, 4};
            for (int i = 1; i <= 4; i++) {
                System.out.print("a[" + i + "]=" + a[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("Exception occur");
        } /*catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occur");
        }*/
    }
}