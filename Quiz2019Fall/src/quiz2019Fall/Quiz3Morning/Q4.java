package quiz2019Fall.Quiz3Morning;

import java.util.regex.*;

/**
 * Created by Hao Wu on 10/10/19.
 */
public class Q4 {
    private static boolean passwordPatternCorrect() {
    Pattern p = Pattern.compile("(\\w)+?.*$");
    Matcher m = p.matcher("Do you like this quiz?");
    boolean b = m.matches();
    System.out.print(b);
    return b;
}
    public static void main(String args[]){
        passwordPatternCorrect();
    }

}
