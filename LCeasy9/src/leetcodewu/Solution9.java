package leetcodewu;

public class Solution9 {
    public boolean isPalindrome(int x) {
        if(Solution9.reverse(x)==x) return true;
        else return false;
    }

    public static int reverse(int x){
        int remain =0;
        while(x>0){
            int temp_pop= x%10;
            x/=10;
            if(remain>Integer.MAX_VALUE/10||(remain==Integer.MAX_VALUE/10&&temp_pop>7)) return 0;
            if(remain<Integer.MIN_VALUE/10||(remain==Integer.MIN_VALUE/10&&temp_pop<-8)) return 0;

            remain=remain*10+temp_pop;
        }
        return remain;
    }
}


