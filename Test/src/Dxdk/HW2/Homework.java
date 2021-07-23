package Dxdk.HW2;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        int nums1 []= { 1,2,3,4,5};

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0 ; i < n ; i++)
            nums1[i + m] = nums2[i];
        Arrays.sort(nums1);
    }

}