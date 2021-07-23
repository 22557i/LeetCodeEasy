package Google2021;

import java.util.HashMap;
import java.util.Map;

public class BullsNCows {
    public static String getHint(String secret, String guess) {
        int r1=0,r2=0;
        int map[] = new int[10];

        for(int i=0;i<secret.length();++i){
            if(secret.charAt(i)==guess.charAt(i))r1++;
            else{
                map[secret.charAt(i)-'0']++;
                map[guess.charAt(i)-'0']--;
                r2++;
            }
        }
        for(int n:map){
            if(n<0)r2+=n;
        }

        return r1+"A"+r2+"B";


    }

  public static void main(String[] args) {
    //
      getHint("1807","7810");

  }
}
