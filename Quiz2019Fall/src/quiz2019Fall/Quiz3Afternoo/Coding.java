package quiz2019Fall.Quiz3Afternoo;

/**
 * Created by Hao Wu on 10/11/19.
 */
public class Coding {
    public static int heightChecker(int[] heights) {
        int count = 0;
        for(int i= 1; i<heights.length; i++){
            if(heights[i]<heights[i-1]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[]test1 = {5,8,1,6,3,7,1,1,1,8,1};
        int[]test2 = {9,8,7,6,5,4,3,2,1};
        int[] test3 = {3,7,1,8,3,2,1,9,5,4,6,9};
        int[] test4 ={5,3,6,6,6,8,7,1,1,9};
        int[]test5 ={1,1,1,1,1,1,1,1,1};
        System.out.println(heightChecker(test1));
        System.out.println(heightChecker(test2));
        System.out.println(heightChecker(test3));
        System.out.println(heightChecker(test4));
        System.out.println(heightChecker(test5));

    }
}
