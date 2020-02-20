package quiz2019Fall.Quiz7Morning;

/**
 * Created by Hao Wu on 11/9/19.
 */
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("foo");
        ArrayList<String> list2 = list1;
        ArrayList<String> list3 = new ArrayList<>(list2);
        list1.add("bar");
        list1.clear();
        list1.add(0,"lol"); /*Line 7*/
        list3.add("baz");
        list2.add("haha");
        List<String> list4 = list3.subList(0, 2); /*Line 10*/
        System.out.println("List1: "+ list1);
        System.out.println("List2: "+ list2);
        System.out.println("List3: "+ list3);
        System.out.println("List4: "+ list4);
    }
}
