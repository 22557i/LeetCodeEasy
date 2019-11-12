package HUAWEI1012;

import java.util.*;


/**
 * Created by Hao Wu on 10/12/19.
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String>list = new ArrayList<>();
        while (sc.hasNext()){
            list.add(sc.next());
        }
        System.out.println(list);
        Map<String,Integer>map = new HashMap<>();
        for (String s :list){
            String temp[] = s.split(",");
            map.put(temp[0],map.getOrDefault(temp[0],0)+Integer.valueOf(temp[1]));

        }
        int count =0;
        for(String s:map.keySet()){
            if(map.get(s)>=10)count++;
        }
        System.out.println(count);
    }
}
