package Assignment1;

import java.util.*;

/*
 * written by Hao wu
 *
 * */
public class Requirement6 {
	public static void readwords(){
		String s = "It was the best of time";
		String words[] = s.split(" ");
		Stack<String>stack = new Stack<>();
		for (int i = words.length-1; i >-1 ; --i) {
			stack.push(words[i]);
		}
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}

	}

	public static void main(String[] args) {
		Requirement6.readwords();//Requirement 6

	}
}
