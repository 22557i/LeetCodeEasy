package lcwu;

public class Solution13 {
    public int romanToInt(String s){
       int total=0;
       for(int i =0;i<s.length();i++) {
           switch (s.charAt(i)) {
               case 'I':{
                   if(i!=s.length()-1) {
            	   if (s.charAt(i + 1) == 'V') {
                       total += 4;
                       i++;
                       break;
                   } else if (s.charAt(i + 1) == 'X') {
                       total += 9;
                       i++;
                       break;
                   } else
                       total += 1;
                       break;
               }else total+=1; break;
                   }
               case 'V':
                   total += 5;
                   break;
               case 'X':
                   if(i!=s.length()-1) {
            	   if (s.charAt(i + 1) == 'L') {
                       total += 40;
                       i++;
                   } else if (s.charAt(i + 1) == 'C') {
                       total += 90;
                       i++;
                   } else
                       total += 10;
                       break;
                   }else total+=10;break;
               case 'L':
                   total += 50;
                   break;
               case 'C':
            	   if(i!=s.length()-1) {
                   if (s.charAt(i + 1) == 'D') {
                       total += 400;
                       i++;
                   } else if (s.charAt(i + 1) == 'M') {
                       total += 900;
                       i++;
                   } else
                       total += 100;
                       break;}
            	   else total+=100;break;
               case 'D':
                   total += 500;
                   break;
                   
               case 'M':
                   total += 1000;
                   break;
           }
       }
       return total;
    }
    public static void main(String args[]){
        Solution13 s13 = new Solution13();
        String a = "MCMXCIV";
        System.out.println(s13.romanToInt(a));
    }
}

