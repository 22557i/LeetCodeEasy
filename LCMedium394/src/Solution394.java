/**
 * Created by Hao Wu on 11/8/19.
 */
import java.util.*;
public class Solution394 {
    public static String decodeString(String s) {

        Stack<Integer> istack = new Stack<>();
        Stack<Character> cstack = new Stack<>();
        String result = "";

        if (s == null || s.length() < 1) {
            return result;
        }

        String c = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                if (s.charAt(i + 1) == '[') {
                    c += s.charAt(i);
                    istack.add(Integer.parseInt(c));
                    c = "";
                } else {
                    c += s.charAt(i);
                }

            } else if (s.charAt(i) == '[' || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                cstack.add(s.charAt(i));

            } else if (s.charAt(i) == ']') {
                String temp = "";
                int count = istack.pop();

                while (cstack.peek() != '[') {
                    temp += cstack.pop();
                }

                cstack.pop();

                String ch = "";
                for (int j = 1; j <= count; j++) {
                    ch += temp;
                }

                int j = ch.length() - 1;

                while (j >= 0) {
                    cstack.add(ch.charAt(j--));
                }
            }
        }
        while (!cstack.empty()) {
            result += cstack.pop();
        }

        StringBuilder input1 = new StringBuilder();
        input1.append(result);
        input1 = input1.reverse();

        return input1.toString();
    }
}
