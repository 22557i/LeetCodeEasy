/**
 * Created by Hao Wu on 9/28/19.
 */


import java.io.*;
import java.nio.Buffer;
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

    public static void main(String[] args) {
        File f = new File("./1.txt");
        String row[];
        try {
            BufferedReader bf = new BufferedReader(new FileReader(f));
             row = bf.readLine().split(",");
             int temp[] =new int[row.length];
            for (int i = 0; i <temp.length ; i++) {
                temp[i] = Integer.parseInt(row[i]);
            }
            for (int i = 0; i <temp.length-1 ; i++) {
                for (int j = 0; j <temp.length-1-i ; j++) {
                    if(temp[j]<temp[j+1]){
                        int t = temp[j];
                        temp[j ] = temp[j+1];
                        temp[j+1] = t;
                    }
                }
            }
            StringBuffer sb = new StringBuffer();
            for(int n:temp)sb.append(n).append(",");
            BufferedWriter bw = new BufferedWriter(new FileWriter("./2.txt"));
            bw.write(sb.substring(0,sb.length()-1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
