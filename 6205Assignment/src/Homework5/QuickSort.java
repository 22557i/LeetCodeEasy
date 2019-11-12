package Homework5;

/**
 * Created by Hao Wu on 10/7/19.
 */
public class QuickSort {
    public static int division(int[] list, int left, int right) {

        int base = list[left];
        while (left < right) {

            while (left < right && list[right] <= base)
                right--;

            list[left] = list[right];


            while (left < right && list[left] >= base)
                left++;

            list[right] = list[left];
        }


        list[left] = base;
        return left;
    }

    public static void Sort(int[] list, int left, int right){

        if (left < right) {

            int base = division(list, left, right);

           Sort(list, left, base - 1);


            Sort(list, base + 1, right);
        }
    }
    public static void QuickSort(int nums[]){
        Sort(nums,0,nums.length-1);
    }

    public static int division(double[] list, int left, int right) {

        double base = list[left];
        while (left < right) {

            while (left < right && list[right] <= base)
                right--;

            list[left] = list[right];


            while (left < right && list[left] >= base)
                left++;

            list[right] = list[left];
        }


        list[left] = base;
        return left;
    }

    public static void Sort(double[] list, int left, int right){

        if (left < right) {

            int base = division(list, left, right);

            Sort(list, left, base - 1);


            Sort(list, base + 1, right);
        }
    }
    public static void quicksort(double nums[]){
        Sort(nums,0,nums.length-1);
    }
    public static void main(String[] args) {
        int nums[] = {54,26,93,17,77,31,44,55,20};
        for(int n :nums)
            System.out.print(n+" ");
        QuickSort(nums);
        System.out.println();
        for(int n :nums)
            System.out.print(n+" ");
    }

}
