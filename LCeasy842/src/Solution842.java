import java.util.Stack;

public class Solution842 {
	public boolean backspaceCompare(String S, String T) {
		Stack<Character> stacks = new Stack<>();
		Stack<Character>stackt = new Stack<>();
		for(char c:S.toCharArray()){
			if(c!='#')stacks.push(c);
			else if (!stacks.isEmpty())stacks.pop();
		}
		for(char c:T.toCharArray()){
			if(c!='#')stackt.push(c);
			else if (!stackt.isEmpty())stackt.pop();
		}
		return String.valueOf(stacks).equals(String.valueOf(stackt));
	}
}
