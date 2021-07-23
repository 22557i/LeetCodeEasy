package Google2021;

import java.util.Arrays;

public class RussianDollEnvelopes {
    class Pair implements Comparable<Pair>
    {
        int i , j;
        Pair(int i , int j)
        {
            this.i = i;
            this.j = j;
        }
        public int compareTo(Pair o)
        {
            return (this.i != o.i) ? this.i - o.i : o.j - this.j;
        }
    }
    public int LIS(Pair[] pairs , int n)
    {
        int dp[] = new int[n];
        int ans = 0;
        for(Pair p : pairs)
        {
            //p.j;
            int i = 0;
            int j = ans;
            while(i < j)
            {
                int mid = i + (j-i) / 2;
                if(dp[mid] < p.j)
                    i = mid + 1;
                else
                    j = mid;
            }
            dp[i] = p.j;
            if(i == ans) ans++;
        }
        return ans;
    }

    public int maxEnvelopes(int[][] envelopes) {
        int i = 0;
        Pair pairs[] = new Pair[envelopes.length];

        for(int p[] : envelopes)
        {
            Pair t = new Pair(p[0] , p[1]);
            pairs[i++] = t;
        }
        Arrays.sort(pairs);
        return LIS(pairs , pairs.length);

    }
}
