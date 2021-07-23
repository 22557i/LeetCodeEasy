package Dxdk.exam0524;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class app {


}
/* Dynamic Programming implementation
of Box Stacking problem in Java*/


class Q10 {

    static class Box implements Comparable<Box>{

        int h, w, d, area;

        public Box(int h, int w, int d) {
            this.h = h;
            this.w = w;
            this.d = d;
        }

        @Override
        public int compareTo(Box o) {
            return o.area-this.area;
        }
    }

    /* Returns the height of the tallest
    stack that can be formed with give
    type of boxes */
    static int maxStackHeight( Box arr[], int n){

        Box[] rot = new Box[n*3];

        for(int i = 0;i < n;i++){
            Box box = arr[i];

            rot[3*i] = new Box(box.h, Math.max(box.w,box.d),
                    Math.min(box.w,box.d));

            rot[3*i + 1] = new Box(box.w, Math.max(box.h,box.d),
                    Math.min(box.h,box.d));

            rot[3*i + 2] = new Box(box.d, Math.max(box.w,box.h),
                    Math.min(box.w,box.h));
        }

        for(int i = 0; i < rot.length; i++)
            rot[i].area = rot[i].w * rot[i].d;

        Arrays.sort(rot);

        int count = 3 * n;
        int[]msh = new int[count];
        for (int i = 0; i < count; i++ )
            msh[i] = rot[i].h;

        for(int i = 0; i < count; i++){
            msh[i] = 0;
            Box box = rot[i];
            int val = 0;

            for(int j = 0; j < i; j++){
                Box prevBox = rot[j];
                if(box.w < prevBox.w && box.d < prevBox.d){
                    val = Math.max(val, msh[j]);
                }
            }
            msh[i] = val + box.h;
        }

        int max = -1;
        for(int i = 0; i < count; i++){
            max = Math.max(max, msh[i]);
        }

        return max;
    }

    /* Driver program to test above function */
    public static void main(String[] args) {

        Box[] arr = new Box[8];
        arr[0] = new Box(1, 2, 4);
        arr[1] = new Box(10, 4, 7);
        arr[2] = new Box(2, 5, 7);
        arr[3] = new Box(3, 6, 6);
        arr[4] = new Box(3, 1, 4);
        arr[5] = new Box(12, 2, 2);
        arr[6] = new Box(10, 1, 5);
        arr[7] = new Box(2, 3, 3);

        System.out.println("The maximum possible "+
                "height of stack is " +
                maxStackHeight(arr,8));
    }
}

