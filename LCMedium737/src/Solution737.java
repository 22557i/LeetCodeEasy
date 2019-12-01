/**
 * Created by Hao Wu on 11/29/19.
 */
import java.util.*;
public class Solution737 {
    public boolean areSentencesSimilarTwo(String[] words1, String[] words2, List<List<String>> pairs) {
        if(words1.length!=words2.length)return false;
        Map<String,List<String>>  map = new HashMap<>();
        for(List<String> l:pairs){
            for(String s:l){
                if(!map.containsKey(s))map.put(s,new ArrayList<String>());
            }
            map.get(l.get(0)).add(l.get(1));
            map.get(l.get(1)).add(l.get(0));
        }

        for (int i = 0; i < words1.length; i++) {
            String w1 = words1[i];
            String w2 = words2[i];
            Stack<String> stack = new Stack();
            Set<String> seen = new HashSet();
            stack.push(w1);
            seen.add(w1);
            label:
            {
                while (!stack.isEmpty()) {
                    String word = stack.pop();
                    if(word.equals(w2))break label;
                    if(map.containsKey(w1)){
                        for(String st:map.get(word)){
                            if(!seen.contains(st)){
                                stack.push(st);
                                seen.add(st);
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }
}
