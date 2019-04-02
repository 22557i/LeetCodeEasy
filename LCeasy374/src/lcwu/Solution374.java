package lcwu;

public class Solution374 {
    public int guessNumber(int n) {
        int min = 1, max = n;
        while (true) {
            int mid = (min + (max - min)/2);
            switch(guess(mid)) {
                case 1: min = mid +1; break;
                case -1: max = mid; break;
                case 0: return mid;
            }
        }

    }

    private int guess(int mid) {
        return 0;
    }
}
