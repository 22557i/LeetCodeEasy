import java.util.*;

/**
 * Created by Hao Wu on 10/23/19.
 */
public class Solution {
    public static int[] solution(int nums1[],int nums2[]){
        int index[] = new int[nums1.length];
        for (int i = 0; i <nums1.length ; i++) {
            for (int j = 0; j <nums2.length ; j++) {
                if(nums1[i]==nums2[j]) {
                    index[i] = j;
                    break;
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <nums1.length ; ++i) {
            boolean flag = false;
            for (int j = index[i]; j <nums2.length ; ++j) {
                if(nums2[j]>nums1[i]){
                    list.add(nums2[j]);
                    flag = true;
                    break;
                }

            }
            if(!flag)list.add(-1);
        }
        int result [] = new int[list.size()];
        for (int i = 0; i <list.size() ; i++) {
            result[i] = list.get(i);
        }

        return result;

    }

    public static void main(String[] args) {
        int nums1 [] = {4,1,2};
        int nums2 [] = {1,3,4,2};

        int result[]  =solution(nums1,nums2);
        for (int n:result)
            System.out.print(n+" ");
    }
}
