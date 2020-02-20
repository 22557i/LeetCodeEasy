package Quiz4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Hao Wu on 2/15/20.
 */
public class Q2 {
    public static void main(String[] args) {
      String[]set = {"ab","abc","bbcc","ac","bbbc"};
      for(String s:set)
          System.out.println(helper(s));
    }

    public static boolean helper(String s){
        Pattern p = Pattern.compile("a*b+c?");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        //System.out.print(b);
        return b;
    }
}
