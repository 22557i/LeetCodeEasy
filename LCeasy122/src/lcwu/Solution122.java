package lcwu;

public class Solution122 {
    public int maxProfit(int[] prices) {

        int maxprofit=0;
        int count=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i+1]>prices[i])
                count +=prices[i+1]-prices[i];

        }
        return count;
    }
}
