package lcwu;

public class Solution443 {
    public int compress(char[] chars){
        int []charcount = new int[128];
       for(int i =0;i<chars.length;i++){
           charcount[(chars[i])]++;
       }

        int count=0;
        for(Integer a:charcount){
            if(a==1)count++;
            if(a>=2)count+=2;
        }

        for (int i = 0, j =0; i < 128; i++) {
            if(charcount[i]==1)chars[j++] =(char)i;
            if(charcount[i]>=2)
            {
               chars[j++] = (char) i;
               if(charcount[i]<10) {
                   chars[j++] = (char) (charcount[i] + 48);
               } else{
                   String s= String.valueOf(charcount[i]);
                   System.out.println(s);
                   for(int k=0;k<s.length();k++){
                       chars[j++] =s.charAt(k);
                   }

               }
            }

        }
       for(Character a: chars) System.out.print(a);
        return count;
    }

    public static void main(String[] args) {
        char a[] = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        Solution443 s443 = new Solution443();
        s443.compress(a);

    }
}
/*
* public int compress(char[] chars) {
        int anchor = 0, write = 0;
        for (int read = 0; read < chars.length; read++) {
            if (read + 1 == chars.length || chars[read + 1] != chars[read]) {
                chars[write++] = chars[anchor];
                if (read > anchor) {
                    for (char c: ("" + (read - anchor + 1)).toCharArray()) {
                        chars[write++] = c;
                    }
                }
                anchor = read + 1;
            }
        }
        return write;
    }
* */