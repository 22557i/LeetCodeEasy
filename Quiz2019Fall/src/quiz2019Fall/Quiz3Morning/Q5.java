package quiz2019Fall.Quiz3Morning;

/**
 * Created by Hao Wu on 10/10/19.
 */
import java.util.regex.*;
public class Q5 {
    public static void main(String[] args) {
        System.out.println(match("ab"));
        System.out.println(match("abc"));
        System.out.println(match("bbcc"));
        System.out.println(match("ac"));
        System.out.println(match("bbbc"));


    }
    public static boolean match(String s){
        java.util.regex.Pattern p = java.util.regex.Pattern.compile("a*b+c?");
        Matcher m = p.matcher(s);

        return m.matches();
    }
}
