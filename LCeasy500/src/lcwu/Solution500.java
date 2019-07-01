package lcwu;


import java.util.*;

public class Solution500 {
	public String[] findWords(String[] words) {
		Set<Character> set1 = new HashSet<>(Arrays.asList('q','w','e','r','t','y','u','i','o','p'));
		Set<Character> set2 = new HashSet<>(Arrays.asList('a','s','d','f','g','h','j','k','l'));
		Set<Character> set3 = new HashSet<>(Arrays.asList('z','x','c','v','b','n','m'));
		List<String> res = new LinkedList<>();
		int index=0;
		for(String s:words){
			if(helper(s.toLowerCase(),set1)||helper(s.toLowerCase(),set2)||helper(s.toLowerCase(),set3)){
				res.add(s);
			}
		}
		String[] result = new String[res.size()];
		for (int i = 0; i <res.size(); i++) {
			result[i]=res.get(i);
		}
		return result;
	}
	public boolean helper(String string, Set<Character> set){
		boolean res= true;
		for (int i = 0;i<string.length(); i++) {
			res = res&&set.contains(string.charAt(i));
			System.out.println(string.charAt(i));
			if(res==false)break;
		}
		return res;
	}
}
