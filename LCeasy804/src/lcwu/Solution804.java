package lcwu;

import java.util.*;

public class Solution804 {
	String[] dictionary = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	public int uniqueMorseRepresentations(String[] words) {
		Set<String> res = new HashSet<>();

		for(String word:words){
			StringBuffer temp = new StringBuffer();
			for(int i =0;i<word.length();i++){
				temp.append(dictionary[word.charAt(i)-'a']);
			}
			if(!res.contains(temp.toString()))res.add(temp.toString());
		}
		return res.size();
	}
}
