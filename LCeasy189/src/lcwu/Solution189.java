package lcwu;

public class Solution189 {
    public static void rotate(int[] nums, int k) {
        int temp, previous;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }

    public static void main(String[] args) {
        int test1[] = {1,2,3,4,5,6,7};
        int test2[] = {3,5,7,8,9,9,2,3,6};
        int test3[] ={2,5,6,2,72,4,6,2};
        int test4[] = {1,1,3,2,5,1,4,2};
        int test5[] = {4,1,5,2,4,1,5,2,5};
        rotate(test1,3);
        rotate(test2,4);
        rotate(test3,5);
        rotate(test4,6);
        rotate(test5,7);
        for (int n:test1)
            System.out.print(n+" ");
        System.out.println();
        for (int n:test2)
            System.out.print(n+" ");
        System.out.println();
        for (int n:test3)
            System.out.print(n+" ");
        System.out.println();
        for (int n:test4)
            System.out.print(n+" ");
        System.out.println();
        for (int n:test5)
            System.out.print(n+" ");
        System.out.println();

    }
}
