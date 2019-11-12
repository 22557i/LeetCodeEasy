package Twitter;

/**
 * Created by Hao Wu on 10/29/19.
 */
import java.util.*;
public class Q2 {
    public static long waitingTime(List<Integer> tickets, int p) {
       long count = 0;
       int pivot = tickets.get(p);
        for (int i = 0; i < tickets.size(); i++) {
            if(i<=p){
                if(tickets.get(i)<=pivot){
                    count+=tickets.get(i);
                }else count+=pivot;
            }else {
                if(tickets.get(i)<pivot){
                    count+=tickets.get(i);
                }else count+=pivot-1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer>tickets = new ArrayList<>();
        tickets.add(2);
        tickets.add(6);
        tickets.add(3);
        tickets.add(4);
        tickets.add(5);
        System.out.println(waitingTime(tickets,2));
    }
}
