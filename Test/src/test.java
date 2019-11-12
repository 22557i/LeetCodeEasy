/**
 * Created by Hao Wu on 9/28/19.
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {
    List<String> retrieveMostFrequentlyUsedWords(String literatureText,
                                                 List<String> wordsToExclude)
    {
        // WRITE YOUR CODE HERE
        String [] temp = literatureText.toLowerCase().split("[ !?',;.\\s]+");
        List<String> dir = new ArrayList<>();
        for(String sw:wordsToExclude){
            String temp1 = sw.toLowerCase();
            dir.add(temp1);
        }
        List<String> res = new ArrayList<>();
        Map<String,Integer>map = new HashMap<>();

        int maxfreq =  Integer.MIN_VALUE;
        for(String s1:temp){
            if(!helper(s1,dir)){
                map.put(s1,map.getOrDefault(s1,0)+1);
                maxfreq = Math.max(maxfreq,map.get(s1));
            }
        }
        for(Map.Entry<String,Integer> e:map.entrySet()){
            if(e.getValue() ==maxfreq)res.add(e.getKey());
        }
        return res;
    }
    boolean helper(String s,List<String> l){
        for(String t:l){
            if(s.equalsIgnoreCase(t))return true;
        }
        return false;
    }

}
