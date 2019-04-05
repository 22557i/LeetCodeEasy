package lcwu;

public class Solution415 {
    public String addStrings(String num1, String num2) {
        StringBuffer res = new StringBuffer();
        int l1 = num1.length() - 1;
        int l2 = num2.length() - 1;
        int i = l1, j = l2, sum = 0, carry = 0;
        while (i >= 0 || j >= 0) {
            int x = i >= 0 ? Character.getNumericValue(num1.charAt(i)) : 0;
            int y = j >= 0 ? Character.getNumericValue(num2.charAt(j)) : 0;
            sum = x + y + carry;
            carry = sum / 10;
            res.append((sum % 10 + ""));
            i--;
            j--;
        }
        if (carry > 0) {
            res.append((carry + ""));
        }
        return res.reverse().toString();
    }
}
