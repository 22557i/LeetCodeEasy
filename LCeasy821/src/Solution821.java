public class Solution821 {
	public int[] shortestToChar(String S, char C) {
		int [] res = new int[S.length()];
		if(S.length()==0)return res;
		char[] s = S.toCharArray();
		for (int i = 0; i <S.length() ; i++) {
			if(s[i]==C){
				res[i]=0;
			}else{
				int a = Integer.MAX_VALUE;
				int b = Integer.MAX_VALUE;
				for (int j = 0; j <i ; j++) {
					if(s[j]==C) a=Math.min(a,i-j);

				}
				for (int j = S.length()-1; j >i ; j--) {
					if(s[j]==C) b=Math.min(b,j-i);
				}
				res[i]=Math.min(a,b);
			}
		}
		return res;
	}
}
