package lcwu;

/**
 * Created by Hao Wu on 11/28/19.
 */
public class S2 {
    public String reverseVowels(String s) {
        int i =0;
        int j = s.length()-1;
        char[] cs = s.toCharArray();
        while(i<j){
            while(!isVowel(cs[i])){
                i++;
            }
            if(i>=j)break;
            while(!isVowel(cs[j])){
                j--;
            }
            if(i>=j)break;
            char temp = cs[i];
            System.out.println(temp+" i= "+i);
            cs[i++] =cs[j];
            System.out.println(cs[j]+" j= "+j);
            cs[j--] = temp;
            System.out.println(i+" "+j);
        }
        return new String(cs);
    }
    private static boolean isVowel(char c) {
        return (c =='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c =='A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }

    public static void main(String[] args) {
        S2 s = new S2();
        System.out.println(s.reverseVowels("hello"));
    }
}
