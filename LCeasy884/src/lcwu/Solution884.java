package lcwu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class Solution884 {
	public String[] uncommonFromSentences(String A, String B) {
		String[]words1 = A.split(" ");
		String[]words2 = B.split(" ");
		Map<String,Integer> map = new HashMap<>();
		for(String s:words1){
			map.put(s,map.getOrDefault(s,0)+1);
		}
		for(String s:words2){
			map.put(s,map.getOrDefault(s,0)+1);
		}
		List<String>res =new ArrayList<>();
		for(String s:map.keySet()){
			if(map.get(s)==1)res.add(s);
		}
		return res.toArray(new String[res.size()]);
	}
}
