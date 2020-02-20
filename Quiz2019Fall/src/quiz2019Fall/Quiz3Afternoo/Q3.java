package quiz2019Fall.Quiz3Afternoo;

import java.util.regex.Matcher;

/**
 * Created by Hao Wu on 10/11/19.
 */
public class Q3 {
    public static boolean match(String s){
        java.util.regex.Pattern p = java.util.regex.Pattern.compile("a*b");
        Matcher m = p.matcher(s);

        return m.matches();
    }

    public static void main(String[] args) {
        System.out.println(match("aaaaa"));
        System.out.println(match("aaaaab"));
        System.out.println(match("b"));
        System.out.println(match("a"));
        System.out.println(match("aaa"));
        System.out.println(match("abbb"));
        System.out.println(match("aaaabbbb"));
    }
}
