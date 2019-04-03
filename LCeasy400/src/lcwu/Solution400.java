package lcwu;

public class Solution400 {
    public  int findNthDigit(int n){
        if (n < 10) {
            return n;
        }
        long length = 1;
        long digits = 0;
        long factor = 9;
        long last = 0;
        while (true) {
            long newDigits = (length * factor) + digits;
            if (newDigits >= n) {
                break;
            }
            last = (last * 10) + 9;
            digits = newDigits;
            factor *= 10;
            length++;
        }
        long unseen = n - digits;
        long remaining = unseen % length;
        last += unseen / length;
        if (remaining == 0) {
            return (int) (last % 10);
        }
        last++;
        for (int i = 0; i < length - remaining; i++) {
            last /= 10;
        }
        return (int) (last % 10);
    }
   public static void main(String[] args) {
        Solution400 s400 = new Solution400();
        System.out.println(s400.findNthDigit(20));

    }
}
