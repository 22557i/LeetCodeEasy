package lcwu;

import java.util.*;
public class Solution401 {

    private int countOneBits(int v) {
        int res = 0;
        while (v > 0) {
            res += v & 1;
            v >>= 1;
        }
        return res;
    }

    public List<String> readBinaryWatch(int num) {
        List<String> result = new ArrayList<>();
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                if (countOneBits(h) + countOneBits(m) == num) {
                    result.add(h + ":" + (m < 10 ? "0" : "") + m);
                }
            }
        }
        return result;
    }
}
