package lcwu;

public class Solution67 {
    public String addBinary(String a, String b) {
    return addKnary(a,b,2);

    }
    public String addKnary(String num1, String num2, int k) {


        char[] c1 = num1.toCharArray();
        char[] c2 = num2.toCharArray();

        int[] res = new int[Math.max(num1.length(), num2.length()) + 1];
        int index = res.length - 1;

        int i1 = c1.length - 1;
        int i2 = c2.length - 1;


        int carry = 0;


        while (i1 >= 0 || i2 >= 0 || carry != 0) {

            int a = i1 >= 0 ? (c1[i1--] - '0') : 0;
            int b = i2 >= 0 ? (c2[i2--] - '0') : 0;
            int tmp = a + b + carry;
            res[index--] = tmp % k;
            carry = tmp / k;

        }


        StringBuilder sb = new StringBuilder();

        index = 0;
        while (index < res.length && res[index] == 0) index++;
        if (index >= res.length) return "0";

        for (int i = index; i < res.length; i++) {
            sb.append(res[i]);
        }
        return sb.toString();

    }
    public static void main(String args[]){
        String a ="10101";
        String b ="01010";
        Solution67 s67=new Solution67();
        s67.addBinary(a,b);
    }
/*
 int num =0;
        for(int i=0;i<a.length();i++){
            num+=Integer.parseInt(a.substring(i,i+1))*Math.pow(2,a.length()-i-1);
        }
        for(int i=0;i<b.length();i++){
            num+=Integer.parseInt(b.substring(i,i+1))*Math.pow(2,b.length()-i-1);
        }
        String s = Integer.toBinaryString(num);
       // System.out.println(num+"     "+s);
    return s;*/


}
