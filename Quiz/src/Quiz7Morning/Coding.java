package Quiz7Morning;

/**
 * Created by Hao Wu on 11/9/19.
 */
import java.util.*;
public class Coding {
    public static char getFirstNonRepeatedChar(String str) {
        Map<Character, Integer> counts = new LinkedHashMap<>(str.length());
        for (char c : str.toCharArray()) {
            counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
        }
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        throw new RuntimeException("Didn't find any non repeated Character");
    }
    public static void main(String[] args) {
        System.out.println(getFirstNonRepeatedChar("Swiss"));   //S
        System.out.println(getFirstNonRepeatedChar("swiss"));   //w
        /*--------------------Hidden Test Cases---------------------*/
        System.out.println(getFirstNonRepeatedChar("JavaJ"));   //v
        System.out.println(getFirstNonRepeatedChar(")(&*(^*^(*^(^(*^(("));      //Exception: (
        System.out.println(getFirstNonRepeatedChar("AaAaAab"));          //Exception: Didn't
    }
}
