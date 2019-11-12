import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Hao Wu on 10/14/19.
 */
public class Solution188 {
    public int maxprofit(int k, int prices[]){
        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxprofit = 0;
        ArrayList<Integer> res = new ArrayList<>();
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
                i++;
            valley = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
                i++;
            peak = prices[i];
            res.add( peak - valley);
        }
        Collections.sort(res,Collections.reverseOrder());
        if(k>=res.size()){
            for (int n :res){
                maxprofit+=n;
            }
        }else{
            for (int j = 0; j <k ; j++) {
                maxprofit+=res.get(j);
            }
        }
        return maxprofit;
    }

}
