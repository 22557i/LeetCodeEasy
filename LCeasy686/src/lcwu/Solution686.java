package lcwu;

public class Solution686 {
	public int repeatedStringMatch(String A, String B) {
		int count =0;
		StringBuffer temp = new StringBuffer(A);
		while(temp.length()<B.length()){
			temp.append(A);
			count++;
		}
		count++;
		if(temp.indexOf(B)>=0)return count;
		if(temp.append(A).indexOf(B)>=0)return ++count;
		return -1;
	}
}
