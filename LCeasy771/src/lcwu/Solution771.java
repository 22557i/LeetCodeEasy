package lcwu;

import java.util.HashSet;

import java.util.*;
public class Solution771 {
	public int numJewelsInStones(String J, String S) {
		Set <Character> jewerset = new HashSet<>();
		char[] jchar = J.toCharArray();
		char[] schar = S.toCharArray();

		for(char c:jchar){
			if(!jewerset.contains(c))jewerset.add(c);
		}
		int res =0;
		for (char c :schar){
			if(jewerset.contains(c))res++;

		}
		return res;
	}
}
