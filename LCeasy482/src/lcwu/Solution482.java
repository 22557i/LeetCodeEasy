package lcwu;

public class Solution482 {
    public String licenseKeyFormatting(String S, int K) {

        String []row =S.split("-");
        StringBuffer res = new StringBuffer();
        int len = 0;
        boolean setDash = false;
        for (int i = S.length()-1; i >= 0; --i) {
            char c = S.charAt(i);
            if (c != '-') {
                ++len;
                if (setDash) {
                    res.append("-");
                    setDash = false;
                }
                res.append(Character.toUpperCase(c));
            }
            if (len == K) {
                len = 0;
                setDash = true;
            }
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
    Solution482 s482 = new Solution482();
        String  s = new String("5F3Z-2e-9-w");
    }
}
