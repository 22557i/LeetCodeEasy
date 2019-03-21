package lcwu;

public class Solution168 {
    public String convertToTitle(int n) {
        StringBuffer s = new StringBuffer();
        while(n>0){
            int a= n%26+65;
            s.append((char)a);
        }
        return s.toString();
    }
}
//return n == 0 ? "" : convertToTitle(--n / 26) + (char)('A' + (n % 26));