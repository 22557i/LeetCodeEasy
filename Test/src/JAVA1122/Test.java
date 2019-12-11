package JAVA1122;

/**
 * Created by Hao Wu on 12/6/19.
 */
import java.util.*;
public class Test {
    public int[][] highFive(int[][] items) {
        Arrays.sort(items,(n1,n2)->n1[0]==n2[0]?n1[0]-n2[0]:n2[1]-n1[1]);
        System.out.println(items);
        return null;
    }

    public static void main(String[] args) {
        Test t = new Test();
        int[][] a = new int[][]{{1,2},{2,1},{3,1,3}};
        t.highFive(a);
    }
}
