package quiz2019Fall.Quiz3Morning;

/**
 * Created by Hao Wu on 10/10/19.
 */
import java.util.*;
public class Q2 {
    public static void main(String []args) {
        ArrayList<Integer> result = new ArrayList<>();
        int[] nums = {2, 8, 3, 6, 1, 10, 5, 7, 4,3};
        int[] copy = nums;
//        for (int i = 0; i < nums.size(); i++) {
//            if (nums[i] % 2 == 1) {
//                result.add(copy[i]);
//                nums[i]++;
//                break;
//            }
//        }
        for (int i: result) {
            System.out.print(i + " " );
        }
    }

}
