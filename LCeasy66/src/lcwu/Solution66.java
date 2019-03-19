package lcwu;

import java.util.Stack;

public class Solution66 {
    public int[] plusOne(int[] digits) {
        int sum=0;
        if(digits==null)return null;
        for(int i=digits.length-1;i>-1;i--){
            sum+=digits[i]*Math.pow(10,(digits.length-1-i));

        }
            System.out.print(sum);
        Stack<Integer> a = new Stack<>();

        sum=sum+1;

        while(sum>0){
            a.push((sum%10));
            sum =sum/10;
        }
        for(Integer temp:a){
            System.out.print(temp);
        }
        int b[] = new int[a.size()];
        System.out.println("");

        for(int j=0;j<b.length;j++){
            System.out.print(a.peek());
            b[j]=a.pop();
        }

        System.out.println("");
        for(Integer temp:b){
            System.out.print(temp);
        }
        return b;
    }
    public static void main(String args[]){
        int c[]={9,8,7,6,5,4,3,2,0,0,0,0,0,0,0};
        int d[]={9,9,9,9};
        Solution66 s66=new Solution66();
        int e[]={};
        e=s66.plusOne(c);

        for(int i =0;i<c.length;i++) {
           // System.out.println(c[i]);

        }
    }
}
/*
* class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int last = digits.length-1;
        int[] answer = new int[digits.length+1];
        for(int i = last; i >= 0; i--){
            digits[i] += carry;
            if(digits[i] == 10){
                digits[i] = 0;
                carry = 1;
            }
            else{
                carry = 0;
            }
        }
        if(carry == 1){
            answer[0] = carry;
            for(int i = 0; i < digits.length; i++){
                answer[i+1] = digits[i];
            }
            return answer;
        }
        return digits;
    }
}*/