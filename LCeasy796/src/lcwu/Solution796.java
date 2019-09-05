package lcwu;

public class Solution796 {
	public boolean rotateString(String A, String B) {
		if(A.length()==0&&B.length()==0)return true;
		if(A.length()!=B.length())return false;

		char []bchar = B.toCharArray();
		for (int i = 0; i <B.length() ; i++) {
			rotatecharArray(bchar);
			if(A.equals(new String(bchar)))return true;
		}
		return false;
	}
	public void rotatecharArray(char[] c){
		if(c.length==1)return;
		char temp = c[0];
		for (int i = 0; i <c.length-1 ; i++) {
			c[i]=c[i+1];
		}
		c[c.length-1]=temp;
	}
}
