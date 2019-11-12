package Homework5;

import java.util.Arrays;

/**
 * Created by Hao Wu on 10/9/19.
 */
public class HeapSort {
    public static void main(String[] args) {
       double nums[] = {27,43,38,3,9,82,10,33,19,15};
        heap_sort(nums,nums.length);
        System.out.println(Arrays.toString(nums));
    }
    public static void heap_sort(double[]tree,int n){
        build_heap(tree,n);
        for (int i = n-1; i >= 0; i--) {
            swap(tree,i,0);
            heapify(tree,i,0);
        }
    }


    public static void build_heap(double[]tree,int n){
        int last_node = n - 1;
        int parent = (last_node - 1)/2;
        for (int i = parent;i >= 0;i--){
            heapify(tree,n,i);
        }
    }
    public static void heapify(double[]tree,int n,int i){
        if(i >= n){
            return;
        }
        int c1 = 2 * i +1;
        int c2 = 2 * i +2;
        int max = i;

        if (c1 < n && tree[max] > tree[c1]){
            max = c1;
        }
        if (c2 < n && tree[max] > tree[c2]){
            max = c2;
        }
        if (max != i){
            swap(tree,max, i);
            heapify(tree,n,max);
        }
    }
    public static void swap(double[]tree,int i,int j){
        double temp = tree[i];
        tree[i] = tree[j];
        tree[j] = temp;
    }
}


