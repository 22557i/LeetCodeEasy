package asd;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;

public class Solution {
   public static List<Integer> getDuplicates(List<Integer>arrOne, List<Integer>arrTwo){
       Set<Integer> set= new HashSet<Integer>();
       for(Integer a :arrOne){
           set.add(a);
       }
       List<Integer>res = new ArrayList<>();
       for(Integer b:arrTwo){
           if(set.contains(b))res.add(b);
       }
       Stack <Integer> stack = new Stack<>();
       Collections.sort(res);
        int []a =new int[res.size()];
        for(int i =0;i<res.size();i++){
            a[i] = res.get(i);
        }
        for(int i =0;i<a.length;i++){
            for(int j=i;j<a.length-1;j++){
                if(a[j]<a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        List<Integer> s = new ArrayList<Integer>();
        for(int i=0;i<a.length;i++){
            s.add(a[i]);
        }
    return s;

   }
}
