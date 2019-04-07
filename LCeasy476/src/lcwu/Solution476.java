package lcwu;

public class Solution476 {
    public int findComplement(int num) {
        int max = 0;
        int i = 0;
        while(i<Integer.toBinaryString(num).length()) {
            max = max | (1 << i);
            i++;
        }
        return num^max;
    }
}
