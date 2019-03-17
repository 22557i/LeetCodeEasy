package lcwu;

import java.util.EmptyStackException;
import java.util.Stack;

public class Solution20 {

	public boolean isValid(String s) {
	Stack<Character> stack1 = new Stack<Character>();
	Stack<Character> stack2 = new Stack<Character>();
	Stack<Character> stack3 = new Stack<Character>();
	Stack<Stack> stack=new Stack<Stack>();
	int i =0;
	int temp1 =0;
	int temp2= 0;
	int temp3= 0;

try {
	for(i=0;i<s.length();i++) {
		if(s.charAt(i)=='(') {
			stack1.push(s.charAt(i));

		}
		if(s.charAt(i)=='{') {
			stack2.push(s.charAt(i));

		}
		if(s.charAt(i)=='[') {
			stack3.push(s.charAt(i));

		}
		if(s.charAt(i)==')') {
			stack1.pop();

		}
		if(s.charAt(i)=='}') {
			stack2.pop();

		}
		if(s.charAt(i)==']') {
			stack3.pop();

		}
	}
}catch(EmptyStackException e) {
	return false;
}
	if(stack1.isEmpty()&&stack2.isEmpty()&&stack3.isEmpty())return true;
	else return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "{}{}{}[]";
		Solution20 s20 = new Solution20();
		System.out.print(s20.isValid(s));
		
	}

}
