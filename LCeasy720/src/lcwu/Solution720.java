package lcwu;

import java.util.*;
public class Solution720 {
	public String longestWord(String[] words) {
		Arrays.sort(words);
		Set<String> set = new HashSet<>();
		String res = "";

		for(String w : words){
			if(w.length() == 1 || set.contains(w.substring(0, w.length()-1))){
				set.add(w);
				if(res.length() < w.length() || (res.length() == w.length() && res.compareTo(w) > 0))
					res = w;
			}
		}
		return res;
	}
}
