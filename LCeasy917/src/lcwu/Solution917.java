package lcwu;

import java.util.Stack;

public class Solution917 {
	public String reverseOnlyLetters(String S) {
		Stack<Character>stack = new Stack<>();
		char[] chars = S.toCharArray();
		for (int i = 0; i <chars.length ; i++) {
			if(((chars[i]>='a'&&chars[i]<='z')||(chars[i]>='A'&&chars[i]<='Z')))stack.push(chars[i]);
		}
		for (int i = 0; i <chars.length ; i++) {
			if(((chars[i]>='a'&&chars[i]<='z')||(chars[i]>='A'&&chars[i]<='Z'))){
				chars[i]=stack.pop();
			}
		}
		return new String(chars);
	}
}
