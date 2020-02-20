package lab6;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Hao Wu on 12/25/19.
 */
public class UniqueEmail {
    public static int numUniqueEmails(String[] emails) {
        Set<String> seen = new HashSet();
        for (String email: emails) {
            int i = email.indexOf('@');
            String local = email.substring(0, i);
            String rest = email.substring(i);
            if (local.contains("+")) {
                local = local.substring(0, local.indexOf('+'));
            }
            local = local.replace(".", "");
            String temp = local + rest;
            seen.add(temp);
        }
        for (String s:seen)
            System.out.print(s+" ");
        return seen.size();
    }

    public static void main(String[] args) {
        String temp[] ={"testemail@leetcode.com","testemail1@leetcode.com","testemail+david@lee.tcode.com"};
        numUniqueEmails(temp);

    }
}
