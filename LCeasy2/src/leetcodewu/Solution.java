package leetcodewu;

public class Solution {
    public int reverse(int x){
        int remain =0;
      while(x!=0){
          int temp_pop= x%10;
          x/=10;
          if(remain>Integer.MAX_VALUE/10||(remain==Integer.MAX_VALUE/10&&temp_pop>7)) return 0;
          if(remain<Integer.MIN_VALUE/10||(remain==Integer.MIN_VALUE/10&&temp_pop<-8)) return 0;

          remain=remain*10+temp_pop;
      }
      return remain;
    }
    public static void main(String args[]){
        Solution s = new Solution();
        int a =789;
        int b = 987;
        int c = 236;
        System.out.println(s.reverse(a)+" "+s.reverse(b)+" "+s.reverse(c));
    }
}
