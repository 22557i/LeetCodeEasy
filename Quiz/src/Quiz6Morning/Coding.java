package Quiz6Morning;

/**
 * Created by Hao Wu on 10/30/19.
 */
import java.util.*;
public class Coding {
    public static List<Integer> findDuplicate(List<Integer> list1, List<Integer> list2) {
        List res = new ArrayList();
        for(int n:list1)
            if(list2.contains(n))res.add(n);
        Collections.sort(res,Comparator.reverseOrder());
        return res;
    }

    public static void main(String[] args) {
        Integer [] l1 = {-1,-2,-3,-5,-7,-25,-38383,1241,24,26};
        Integer [] l2 = {1,41,25,26,24,-3,-25};
        System.out.println(findDuplicate(new ArrayList<>(Arrays.asList(l1)),new ArrayList<>(Arrays.asList(l2))));
    }
}
