/**
 * Created by Hao Wu on 12/3/19.
 */
public class Solution1137 {
    public int tribonacci(int n) {
        if(n==0||n==1)return n;
        if(n==2)return n-1;

        int p1=0;
        int p2 =1,p3 =1;
        int cur =0;
        while(n>2){
            cur =p1+p2+p3;
            p1 = p2;
            p2 = p3;
            p3 = cur;
            n--;
        }
        return cur;
    }

    public static void main(String[] args) {
        Solution1137 s1137 = new Solution1137();
        for (int i = 0; i <10 ; i++) {
            System.out.print(s1137.tribonacci(i)+" -> ");
        }
    }
}
