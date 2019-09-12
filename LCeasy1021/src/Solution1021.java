public class Solution1021 {
	public String removeOuterParentheses(String S) {
		int i=0;
		StringBuilder sb=new StringBuilder();
		for(char c:S.toCharArray()){
			if(i==0){i++;}
			else{
				if(c=='('){i++;}
				else{i--;}
				if(i!=0)sb.append(c);
			}

		} return sb.toString();
	}
}
