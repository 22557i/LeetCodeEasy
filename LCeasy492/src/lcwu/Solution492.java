package lcwu;

public class Solution492 {
    public int[] constructRectangle(int area) {
        int[] result = new int[2];
        if (area <= 0)
            return result;
        result[0] = 1;
        result[1] = 1;
        for (int i = (int)Math.sqrt(area); i >= 1; i--) {
            if (area % i == 0) {
                result[1] = i;
                result[0] = area / i;
                break;
            }
        }
        return result;
    }
}
