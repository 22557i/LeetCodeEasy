package lcwu;

public class Solution202 {
    public boolean isHapply(int n){
      int trans =  transfer(n);
      if(trans/10==0&&trans!=1)return false;
      if(trans==1) return true;
      else return isHapply(trans);
    }
    public int transfer(int n){
        String s = String.valueOf(n);
        int []temp = new int[s.length()];
        int count =0;
        for(int i =0;i<temp.length;i++){
            temp[i] =(int) Math.pow((int)(s.charAt(i)-48),2);
            count += temp[i];
        }
        return count;
    }

    public static void main(String args[]){
        Solution202 s202 = new Solution202();

        int n =86;

        System.out.println(s202.isHapply(n));
    }
}
/*
* public boolean isHappy(int n) {
        while(true) {
            if(n==4) return false;
            if(n==1) return true;
            n = nextHappy(n);
        }
    }
    private int nextHappy(int n) {
        int sum = 0;
        int lastDigit;
        while(n!=0) {
            lastDigit = n % 10;
            n /= 10;
            sum += lastDigit * lastDigit;
        }
        return sum;
    }*/