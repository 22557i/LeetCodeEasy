package lcwu;

public class Solution121 {
    public int maxProfit(int[] prices) {
        int max=0;
        for(int i =0;i<prices.length;i++){
            for(int j =i+1;j<prices.length;j++){
                max =Math.max(max,prices[j]-prices[i]);
            }
        }
        return (max==0)?0:max;
    }
}
/*
* public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices.length == 1) return 0;

        int maxProfit = 0;
        int min = prices[0];

        for(int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - min);
        }

        return maxProfit;
    }*/