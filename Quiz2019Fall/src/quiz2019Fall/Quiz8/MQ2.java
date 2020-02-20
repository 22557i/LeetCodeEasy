package quiz2019Fall.Quiz8;

/**
 * Created by Hao Wu on 11/15/19.
 */
public class MQ2 {
    public static void main(String[] args) {
        int[] numbers = { 1, 3, 5, 2, 8, 9, 5, 0 };
        int n = numbers[0];
        for (int i = 0; i <= (numbers.length - 1); i++) {
            if (numbers[i] < n)
                n = numbers[i];
            System.out.print(n);
        }

    }
}
