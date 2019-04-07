package lcwu;

import java.util.*;
public class Solution475 {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int ret = 0;
        for (int h : houses) {
            int dist = dist(h, heaters);
            if (dist > ret) {
                ret = dist;
            }
        }
        return ret;
    }

    public int dist(int house, int[] heaters) {
        int size = heaters.length;
        int first = heaters[0];
        if (house <= first) {
            return first - house;
        }
        int last = heaters[size - 1];
        if (house >= last) {
            return house - last;
        }

        int idxLeft = 0;
        int idxRight = size - 1;

        while (true) {
            if (idxLeft == idxRight) {
                return Math.abs(house - heaters[idxLeft]);
            }
            if (idxLeft + 1 == idxRight) {
                return Math.min(house - heaters[idxLeft], heaters[idxRight] - house);
            }
            int mid = (idxLeft + idxRight) / 2;
            int value = heaters[mid];
            if (house == value) {
                return 0;
            } else if (house < value) {
                idxRight = mid;
            } else {
                idxLeft = mid;
            }
        }
    }
}
