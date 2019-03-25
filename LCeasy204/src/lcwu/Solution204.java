package lcwu;

public class Solution204 {
    public int countPrimes(int n){
        if(n==2)return 0;
        int count=0;
        for(int i =0;i<=n;i++){
            if(isprime(i))count++;
        }
        return count;
    }
    public boolean isprime(int n){
        if(n<2)return false;
        if(n==2) return false;
        int count=2;
        if(n>2){
            for(int i =2;i<n;i++){
                if(n%i==0)count++;
            }
        }
        return (count==2)?true:false;
    }
}
/*
* if (n <= 2) return 0;
        boolean sieve[] = new boolean[n+1];
        sieve[2] = true;
        for(int i = 3; i < n; i+=2) {
            sieve[i] = true;
        }

        for (int p = 3; p*p<=n; p++){
            if (sieve[p]){
                for (int i = p+p; i<=n; i += p ){
                    sieve[i] = false;
                }
            }
        }
        int count = 1;
        for (int i = 3; i < n; i+=2){
            count += sieve[i] ? 1:0;
        }
        return count;      */