package Google2021;

import java.util.*;
public class TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> list = new ArrayList<>();
        if (words == null || words.length == 0 || maxWidth <= 0) {
            return list;
        }
        // step 1. generate basic rows
        String curr = "";
        for (String word : words) {
            if (curr.equals("")) { // #1. first word we don't want a leading space!
                curr = word;
                continue;
            }
            if (curr.length() + 1 + word.length() > maxWidth) {
                list.add(curr);
                curr = word;
            } else {
                curr = curr + " " + word;
            }
        }
        if (curr.length() > 0) {  // #2. don't forget to add the last one!
            list.add(curr);
        }
        // step 2. add proper spaces
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String row = list.get(i);
            if (!row.contains(" ") || i == list.size() - 1) { // #3. one-word row OR the last row: special cases!
                StringBuilder sb = new StringBuilder();
                for (int k = 0; k < maxWidth - row.length(); k++) {
                    sb.append(' ');
                }
                row = row + sb.toString();
            }
            while (row.length() < maxWidth) {
                for (int j = 1; row.length() < maxWidth && j < row.length(); j++) {  // #4. should check row.length() < maxWidth again!
                    if (row.charAt(j - 1) != ' ' && row.charAt(j) == ' ') {
                        row = row.substring(0, j) + " " + row.substring(j);
                    }
                }
            }
            ans.add(row);
        }
        return ans;
    }
}
