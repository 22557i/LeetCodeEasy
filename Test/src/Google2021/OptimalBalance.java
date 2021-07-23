package Google2021;

import java.util.Arrays;

public class OptimalBalance {
    public int minTransfers(int[][] transactions) {
        // there are 0 to 20 ids and so we need an array of size 21 to store the balances
        int[] balance = new int[21];

        for(int i=0; i < transactions.length; i++) {
            balance[transactions[i][0]] -= transactions[i][2];
            balance[transactions[i][1]] += transactions[i][2];
        }

        // sort the array so that all positive numbers go to the right and all negative go to the left
        // this is not expensive as the array size itself is really small
        Arrays.sort(balance);

        // helpers transfers balance from right to left/ +ve to -ve values
        int minTransfers = helper(balance, balance.length-1);
        return minTransfers == Integer.MAX_VALUE ? 0 : minTransfers;
    }

    private int helper(int[] balance, int index) {
        // we stop when we know that there is no +ve balance left in the array
        // at this point all the values in the array are zero
        // this works because we sorted the array
        if(balance[index]==0) {
            return 0;
        }

        int min = Integer.MAX_VALUE;
        int prevBalanceAtI;
        int prevBalanceAtIndex;
        for(int i=0; i<index; i++) {
            if(balance[i] < 0) {
                prevBalanceAtI = balance[i];
                prevBalanceAtIndex = balance[index];
                if(Math.abs(balance[i]) >= balance[index]) {
                    balance[i] += balance[index];
                    balance[index] = 0;
                } else {
                    balance[index] += balance[i];
                    balance[i] = 0;
                }
                if(balance[index] == 0) {
                    min = Math.min(min, 1+ helper(balance, index-1));
                } else {
                    min = Math.min(min, 1+ helper(balance, index));
                }
                balance[index] = prevBalanceAtIndex;
                balance[i] = prevBalanceAtI;
            }
        }
        return min;
    }
}
