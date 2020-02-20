package quiz2019Fall.Quiz4Afternoon;

/**
 * Created by Hao Wu on 10/15/19.
 */
import java.util.*;
public class Q2 {
    public static void main(String []args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("2");
        list.add("0");
        list.add("1");
        list.add("8");
        List<String> newList = next(list);
        list.add("9");
        for (String i: newList) {
            System.out.print(i + " ");
        } }
    private static List<String> next(List<String>list) {
        list.remove(list.size()-1);
        return list;
    }

}
