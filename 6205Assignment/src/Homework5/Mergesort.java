package Homework5;

import java.util.Arrays;

/**
 * Created by Hao Wu on 10/7/19.
 */
public class Mergesort {
    public static void mergeSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public static void sort(int[] arr, int L, int R) {
        if (L == R) {
            return;
        }
        int mid = L + ((R - L) / 2);
        sort(arr, L, mid);
        sort(arr, mid + 1, R);
        merge(arr, L, mid, R);
    }

    public static void merge(int[] arr, int L, int mid, int R) {
        int[] temp = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= R) {
            temp[i++] = arr[p1] > arr[p2] ? arr[p1++] : arr[p2++];
        }

        while (p1 <= mid) {
            temp[i++] = arr[p1++];
        }
        while (p2 <= R) {
            temp[i++] = arr[p2++];
        }
        for (i = 0; i < temp.length; i++) {
            arr[L + i] = temp[i];
        }
    }
    public static void mergeSort(double[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public static void sort(double[] arr, int L, int R) {
        if (L == R) {
            return;
        }
        int mid = L + ((R - L) / 2);
        sort(arr, L, mid);
        sort(arr, mid + 1, R);
        merge(arr, L, mid, R);
    }

    public static void merge(double[] arr, int L, int mid, int R) {
        double[] temp = new double[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= R) {
            temp[i++] = arr[p1] > arr[p2] ? arr[p1++] : arr[p2++];
        }

        while (p1 <= mid) {
            temp[i++] = arr[p1++];
        }
        while (p2 <= R) {
            temp[i++] = arr[p2++];
        }
        for (i = 0; i < temp.length; i++) {
            arr[L + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int data[] = {27,43,38,3,9,82,10,33,19,15};
        Arrays.stream(data).forEach(n-> System.out.print(n+" "));
        mergeSort(data);
        System.out.println("\nAfter sorting");
        Arrays.stream(data).forEach(n-> System.out.print(n+" "));
    }
}
