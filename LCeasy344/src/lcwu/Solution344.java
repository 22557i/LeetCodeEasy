package lcwu;

public class Solution344 {
    public void reverseString(char[] s){
        StringBuffer s1 = new StringBuffer();
        for (int i = 0; i <s.length ; i++) {
            s1.append(s[i]);
        }
        s=s1.reverse().toString().toCharArray();
        for(Character a :s){
            System.out.println(a);
        }
    }
    public static void main(String args[]){

        char[]s ={'h','e','l','l','o'};
        Solution344 s344 = new Solution344();
        s344.reverseString(s);
    }
}
/*
*  int i=0;
        int j= s.length-1;
        while(i<j){
             char c = s[i];
             s[i++] = s[j];
             s[j--] = c;
        }*/