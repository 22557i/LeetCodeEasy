package Homework10;
import java.util.*;
/**
 * Created by Hao Wu on 11/22/19.
 */
public class Q4 {
    private static int size[]={0,3,4,7,8,9};
    private static int values[] = {0,4,5,10,11,12};
    static class Item {

        int totalValue = 0;
        ArrayList<Integer> itemLink = new ArrayList<>();
    }
    static int solve1(int[] price, int[] weigh, int v) {
        int len = price.length;
        Item[] table = new Item[v + 1];

        for (int i = 0; i <= v; i++) {
            table[i] = new Item();
        }
        for (int i = 0; i < len; i++) {
            for (int j = weigh[i]; j <= v; j++) {
                int result2 = table[j - weigh[i]].totalValue;//F [v]
                int result1 = table[j].totalValue;//F[v-Wi]
                if(result1 < result2 + price[i]){
                    table[j].totalValue = result2+price[i];
                    table[j].itemLink.clear();
                    table[j].itemLink.addAll(table[j - weigh[i]].itemLink);
                    table[j].itemLink.add(i+1);

                }
            }
        }
        System.out.print("The item list is: ");
        System.out.println(table[v].itemLink);
        int res=0;
        for(int n:table[v].itemLink)
            res +=price[n-1];
        return res;
    }
    public static void main(String[] args) {
        int[] v = {8, 10, 6, 3, 7, 2};
        int[] w = {4, 6, 2, 2, 5, 1};
        System.out.println("The sum of values is : "+solve1(values, size, 21));
    }



}
