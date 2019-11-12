/**
 * Created by Hao Wu on 10/24/19.
 */
public class Solution96 {
    public int numTrees(int n) {
        long res = 1;
        for(int i =0;i<n;++i){
            res = res * 2 *(2*i+1)/(i+2);
        }
        return (int)res;
    }
}
