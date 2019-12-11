/**
 * Created by Hao Wu on 12/5/19.
 */
public class Solution276 {
}
class Solution {
    public int numWays(int n, int k) {
        if (n == 0 || k == 0 || (k == 1 && n > 2)) return 0;
        if (n == 1) return k;
        int prevNonEq = k * (k - 1);
        int res = prevNonEq + k;
        for (int i = 3; i <= n; i++) {
            res = res * (k - 1) + prevNonEq;
            prevNonEq = res - prevNonEq;
        }
        return res;
    }
}
// If p1 and p2 are not equal then for p1 we can choose from k possibilities and for p2 we can choose from k - 1 possibility.
// So, for now, we have k * (k - 1).
// If p1 and p2 are equal then we have another k possibilities then the answer is equal to k * (k - 1) + k

// 3rd (interesting)case: n = 3, k > 1, (p1, p2, p3)
// if p2 and p3 are not equal then for p3 we can choose from k - 1 possibility.
// So for now we have (k * (k - 1) + k) * (k - 1). (k * (k - 1) + k) - is a whole set of possibilities from the previous case
// and it is quite obvious that for every p2's color we are able to choose different colors for the p3.
// If p2 and p3 are equal then p2 and p1 should not be equal and how many of such possibilities do exist?
// The answer is from the case 2 = k * (k - 1)
// In the result for the current case we have = (k * (k - 1) + k) * (k - 1) + k * (k - 1)