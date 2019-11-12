package Twitter;

/**
 * Created by Hao Wu on 10/29/19.
 */
import java.util.*;
public class Q3 {

    public static int getUniqueUserIdSum(List<Integer> arr) {
      int nums[] = new int[arr.size()];
        for (int i = 0; i <arr.size() ; i++) {
            nums[i] = arr.get(i);
        }
        int result = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]<=nums[i-1])nums[i] = nums[i-1]+1;
            result+=nums[i];
        }
        return result+nums[0];
    }

}
