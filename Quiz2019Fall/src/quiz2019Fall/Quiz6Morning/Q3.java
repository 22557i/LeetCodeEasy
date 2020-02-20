package quiz2019Fall.Quiz6Morning;

/**
 * Created by Hao Wu on 10/30/19.
 */
import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(9);
        list.add(6);
        list.remove(2);
        list.remove(6);
        list.add(50/3);
        list.add(3, 15);
        System.out.print("[" + list.get(0));
        for ( int i = 1; i < list.size(); i++ ) {
            if (Judge(list.get(i))) {
                System.out.print("," + list.get(i));
            }
        }
        System.out.println("]");
    }
    private static boolean Judge (int n) {
        return n%2 == 0 || n%3 == 0;
    }

}
