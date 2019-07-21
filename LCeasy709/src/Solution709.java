public class Solution709 {
	public String toLowerCase(String str) {
		char temp[] = str.toCharArray();
		StringBuffer res = new StringBuffer();
		for (char c:temp){
			if(c>='A'&&c<='Z')res.append((char)(c+32));
			else res.append(c);
		}
		return res.toString();
	}
}
