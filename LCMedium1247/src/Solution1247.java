import java.util.*;

public class Solution1247 {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> q = new Stack<>();
        int n = s.length();
        char[] cs = s.toCharArray();
        boolean[] remove = new boolean[n];
        for (int i = 0; i < n; ++i) {
            if (cs[i] == '(') {
                q.push(i);
            } else if (cs[i] == ')') {
                if (q.isEmpty()) {
                    remove[i] = true;
                } else {
                    q.pop();
                }
            }
        }
        while (!q.isEmpty()) {
            remove[q.peek()] = true;
            q.pop();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            if (!remove[i]) {
                sb.append(cs[i]);
            }
        }
        return sb.toString();
    }
}
