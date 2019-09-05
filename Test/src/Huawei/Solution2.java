package Huawei;

import java.util.Scanner;

public class Solution2 {
	public void solution() {
		Scanner scanner = new Scanner(System.in);
		String[] list  = new String[6];
		int i=0;
		while(scanner.hasNext()){
			list[i++] = scanner.next();
		}
		for (int j = 0; j < 3; j++) {
			if(helper(list[2*j],list[2*j+1])) System.out.println("1");
			else System.out.println("0");
		}

	}
	public boolean helper(String A, String B){
		if(A.length()<B.length())return false;
		if(A.length()==B.length()){
			if(A.equals(B))return true;
			else return false;
		}
		for (int i = 0; i <A.length() ; i++) {
			if(A.contains(B))return true;
			A =rotateString(A);
		}
		return false;
	}
	public String rotateString(String B){
		if(B.length()==0||B.length()==1)return B;
		StringBuffer temp = new StringBuffer();
		temp.append(B.charAt(B.length()-1));
		temp.append(B.substring(0,B.length()-1));
		System.out.println(temp.toString());
		return temp.toString();
	}

	public static void main(String[] args) {
		Solution2 s2 = new Solution2();
		if(s2.helper("AABCD","CDAA") )System.out.println("1");
		else System.out.println("0");
		if(s2.helper("AABCD","ABCD") )System.out.println("1");
		else System.out.println("0");
	}
}
