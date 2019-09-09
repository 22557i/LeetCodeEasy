import java.util.HashSet;
import java.util.*;

public class Solution859 {
	public boolean buddyStrings(String A, String B) {
		if(A.length()!=B.length())return false;
		char[]a = A.toCharArray();
		char[]b = B.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i =0;i<a.length;++i){
			if(a[i]!=b[i])return false;
		}
		Set<Character> set = new HashSet<>();
		for(char c:A.toCharArray()){
			set.add(c);
		}
		if(A.equals(B)){
			int[] count = new int[26];
			for (int i = 0; i < A.length(); ++i)
				count[A.charAt(i) - 'a']++;

			for (int c: count)
				if (c > 1) return true;
			return false;
		}
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < A.length(); ++i) {
			if(A.charAt(i)!=B.charAt(i)){
				list.add(i);
			}
		}
		return list.size()==2;
	}
}
