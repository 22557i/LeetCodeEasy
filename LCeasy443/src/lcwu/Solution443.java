package lcwu;

public class Solution443 {
    public int compress(char[] chars){
        int []charcount = new int[128];
        for(Character a :chars)charcount[a]++;

        int count=0;
        for(Integer a:charcount){
            if(a==1)count++;
            if(a>=2)count+=2;
        }

        for (int i = 0, j =0; i < chars.length; i++) {
            if(charcount[i]==1)chars[j++] =(char)i;
            if(charcount[i]>=2)
            {
               chars[j++] = (char) i;
               if(charcount[i]<10) {
                   chars[j++] = (char) (charcount[i] + 48);
               } else{
                   String s= String.valueOf(charcount[i]);
                   for(int k=0;k<s.length();k++){
                       chars[j++] =s.charAt(k);
                   }

               }
            }

        }
        return count;
    }

    public static void main(String[] args) {
        char a[] = {'a','a','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b'};
        Solution443 s443 = new Solution443();
        s443.compress(a);
        for(Character cha: a){
            System.out.println(cha);
        }
    }
}
