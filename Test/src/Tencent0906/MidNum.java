package Tencent0906;

import java.util.Arrays;
import java.util.Scanner;

public class MidNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[] = new int[sc.nextInt()];
        for(int i =0;i<nums.length;++i)
            nums[i] = sc.nextInt();

        for(int i =0;i<nums.length;++i){
            int temp[] = new int[nums.length-1];
            for(int j = 0;j<nums.length;++j){
                if(j<i)temp[j] = nums[j];
                else if(j>i)temp[j-1] = nums[j];
            }
            Arrays.sort(temp);
            System.out.println(Arrays.toString(temp));
            System.out.println(temp[nums.length/2-1]);
        }
    }
}
