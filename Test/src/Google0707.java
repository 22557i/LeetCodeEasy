import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Google0707 {
    public static int solution(int[] A){

        PriorityQueue<Integer>pq = new PriorityQueue<>(Comparator.reverseOrder());
        Arrays.sort(A);

        for(int i =0;i<A.length/2;i++){
            pq.offer(A[i]+A[A.length-1-i]);
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int A[] = {2,3,1,1};
        System.out.println(solution(A));
    }
    //You are given an array A of N integers (N is even). Split array A into N/2 pairs in such a way that the largest sum of any pair will be as small as possible. Each element has to belong to exactly one pair.
    //
    //For example, given array A = [4, 5, 3, 1], we can split it into pairs in three ways:
    //
    //(4, 5) and (1, 3), where the sums of the pairs' elements are 9 and 4. The largest sum is 9.
    //
    //(4, 1) and (5, 3), where the sums of the pairs' elements are 5 and 8. The largest sum is 8.
    //
    //(4, 3) and (5, 1), where the sums of the pairs' elements are 7 and 6. The largest sum is 7.
    //
    //In the above splits, pairs with the largest sums of elements are (4, 5), (5, 3) and (4, 3). Of these, the smallest is 4 + 3 = 7.
    //
    //Write a function:
    //
    //class Solution { public int solution(int[] A); }
    //
    //that, given an array A of N integers, returns the largest sum of the pairs' elements in the optimal split.
    //
    //Examples:
    //
    //1. Given A = [4, 5, 3, 1], the function should return 7, as explained above.
    //
    //2. Given A = [2, 3, 1, 1], the function should return 4. The optimal split is (1, 3) and (1, 2), where the sums of pairs are 1 + 3 = 4 and 1 + 2 = 3, and 4 is the larger.
    //
    //3. Given A = [−5, −6], the function should return −11. We can make only one pair, (−5, −6), whose sum is −11.
    //
    //4. Given A = [2, 2, 2, 2, 2, 2], the function should return 4. The only possible split is (2, 2), (2, 2) and (2, 2), where the sums of all pairs are equal to 4.
    //
    //Write an efficient algorithm for the following assumptions:
    //
    //N is an even integer within the range [2..100,000];
    //
    //each element of array A is an integer within the range [−1,000,000,000..1,000,000,000].

    public static int solution(int A) {
        int res = Integer.MAX_VALUE;
        String s = A+"";
        for (int i =1;i<s.length();i++)
            res = Math.min(res,helper(s.substring(0,i),s.substring(i)));
        return res;
    }
    public static int helper(String a, String b) {
        return Math.abs(Integer.valueOf(a)-Integer.valueOf(b));
    }
    //You can split an integer N into two non-empty parts by cutting it between any pair of consecutive digits. After such a cut, a pair of integers A, B is created.
    //
    //Your task is to find the smallest possible absolute difference between A and B in any such pair. If integer B contains leading zeros, ignore them when calculating the difference.
    //
    //For example, the number N = 12001 can be split into:
    //
    //A = 1 and B = 2001. Their absolute difference is equal to |1 − 2001| = 2000.
    //
    //A = 12 and B = 001. Their absolute difference is equal to |12 − 1| = 11.
    //
    //A = 120 and B = 01. Their absolute difference is equal to |120 − 1| = 119.
    //
    //A = 1200 and B = 1. Their absolute difference is equal to |1200 − 1| = 1199.
    //
    //In this case, the minimum absolute difference is equal to |12 − 1| = 11 for A = 12 and B = 001.
    //
    //Write a function:
    //
    //
    //
    //class Solution { public int solution(int N); }
    //
    //
    //
    //that, given an integer N, returns the smallest possible absolute difference of any split of N.
    //
    //Examples:
    //
    //1. Given N = 12001, your function should return 11, as explained above.
    //
    //2. Given N = 510, your function should return 5. The possible splits are:
    //
    //A = 5 and B = 10, with the absolute difference equal to |5 − 10| = 5,
    //
    //A = 51 and B = 0, with the absolute difference equal to |51 − 0| = 51.
    //
    //The smallest possible absolute difference is 5.
    //
    //3. Given N = 7007, your function should return 0. The smallest absolute difference can be achieved by splitting N into A = 7, B = 007.
    //
    //In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
    //
    //Assume that:
    //
    //N is an integer within the range [10..1,000,000,000].
}
