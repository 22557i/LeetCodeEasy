package Google1213;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1213 {
    public int Q1(int n){
        for(int i =1;i<n;i++){
            if(Fibonacci(i-1)<n && n<Fibonacci(i))
                return Math.min(n-Fibonacci(i-1), Fibonacci(i)-n);
        }
        return -1;
    }
    public int Fibonacci(int n) {
        if(n==1||n==0) return n;
        int a=0,b=1;
        int res=0;
        for(int i=2;i<=n;i++){
            res=a+b;
            a=b;
            b=res;
        }
        return res;
    }

    public String solution(String S){
        int n = Integer.valueOf(S);
        String hex= Integer.toHexString(n).toUpperCase();
        System.out.println(hex);
        String res = hex.replace('1','I').replace('0','O');
        return Q2Helper(res)? "ERROR": res;
    }
    public boolean Q2Helper(String s){
        return s.contains("2")||
                s.contains("3")||
                s.contains("4")||
                s.contains("5")||
                s.contains("6")||
                s.contains("7")||
                s.contains("8")||
                s.contains("9");
    }

    public int Q3(int[]A){
        for (int i = A.length - 1; i > 1; i--) {
            for (int j = 1; j < i; j++) {

                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }

            }
        }

        int apples = 0, units = 0;
        for (int i = 1; i < A.length && units + A[i] <= 5000-A[0]; i++) {
            apples++;
            units += A[i];
        }
        return apples;
    }

    public int solution1(String S) {
        S += "A";
        int i = 0, j = 0, res = 0;
        while (i < S.length()) {
            while (S.charAt(i) != S.charAt(j)) {
                res += i - j;
                j++;
            }
            i++;
        }
        return res;
    }
    public int[] solution(int[] A) {
        int[] res = Arrays.copyOf(A, A.length);
        int flag = 0;
        while(true){
            flag = 0;
            for(int i = 1; i < A.length - 1; i++){
                if(A[i] < A[i-1] && A[i] < A[i+1]){
                    res[i] = A[i] + 1;
                    flag = 1;
                }
                else if(A[i] > A[i-1] &&  A[i] > A[i+1]){
                    res[i] = A[i] - 1;
                    flag = 1;
                }
            }
            if(flag == 0){
                break;
            }
            else{
                A = Arrays.copyOf(res, res.length);
            }
        }
        return A;
    }
    public int q1(int X) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        int pre1 = 1;
        int pre2 = 1;
        int next = pre1 + pre2;
        while(next <= X){
            list.add(next);
            pre1 = pre2;
            pre2 = next;
            next = pre1 + pre2;
        }
        if(list.indexOf(X) >= 0){
            return 1;
        }else{
            int count = helper(list, X);
            return count;
        }
    }
    private int helper(List<Integer> list, int k){
        int copy = k;
        int count = 0;
        for(int i = list.size() - 1; i >= 0; i--){
            while(k >= list.get(i)){
                k -= list.get(i);
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Solution1213 s = new Solution1213();
    }
}
