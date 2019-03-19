package lcwu;

public class Solution69 {
    public int mySqrt(int x) {
        int i = 0;
        for (; Math.pow(i, 2) < x; i++) {
        }
        return i;
    }
}