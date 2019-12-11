package WeeklyContest1207;

/**
 * Created by Hao Wu on 12/7/19.
 */
import java.util.*;
public class Q2 {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer,List<Integer>>map = new HashMap<>();
        for (int i = 0; i <groupSizes.length ; i++) {
            map.computeIfAbsent(groupSizes[i],x->new ArrayList<>()).add(i);
        }
        List<List<Integer>>res = new ArrayList<>();

        for(int n:map.keySet()){
            for (int i = 0; i <map.get(n).size() ; i=i+n) {
                System.out.println(map.get(n).size());
                List temp = map.get(n).subList(i,i+n);
                res.add(temp);
            }
        }

       return res;
    }

    public static void main(String[] args) {
        Q2 q = new Q2();
        int[]a = new int[]{3,3,3,3,3,1,3};

        System.out.println(q.groupThePeople(a));
    }
}
