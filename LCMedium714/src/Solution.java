/**
 * Created by Hao Wu on 10/11/19.
 */
public class Solution {
    public int maxProfit(int[] prices, int fee) {
        int bottom;
        int top;
        int maxprofit=0;
        bottom=top=prices[0];
        int i=0;
        while(i<prices.length){
            while(i<prices.length&&prices[i]-prices[i+1]>=2){
                i++;
            }
            bottom = prices[i];
            while(i<prices.length&&prices[i+1]-prices[i]>=2){
                i++;
            }
            top = prices[i];
            maxprofit += top-bottom;

        }
        return maxprofit;
    }
}
