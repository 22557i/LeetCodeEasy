package lcwu;

public class Solution13 {
    public int romanToInt(String s){
       int total=0;
       for(int i =0;i<s.length();i++)
           switch (s.charAt(i)) {
               case 'I':
                   if (s.charAt(i + 1) == 'V') {
                       total += 4;
                       i++;
                   } else if (s.charAt(i + 1) == 'X') {
                       total += 9;
                       i++;
                   } else
                       total += 1;

               case 'V':
                   total += 5;
               case 'X':
                   if (s.charAt(i + 1) == 'L') {
                       total += 40;
                       i++;
                   } else if (s.charAt(i + 1) == 'C') {
                       total += 90;
                       i++;
                   } else
                       total += 10;
               case 'L':
                   total += 50;
               case 'C':
                   if (s.charAt(i + 1) == 'D') {
                       total += 400;
                       i++;
                   } else if (s.charAt(i + 1) == 'M') {
                       total += 900;
                       i++;
                   } else
                       total += 100;
               case 'D':
                   total += 500;
               case 'M':
                   total += 1000;
           }
       return total;
    }
    public static void main(String args[]){
        Solution13 s13 = new Solution13();
        String a = "LVIII";
        System.out.println(s13.romanToInt(a));
    }
}

