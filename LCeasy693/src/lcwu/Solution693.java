package lcwu;

public class Solution693 {
	public boolean hasAlternatingBits(int n) {
		String res = Integer.toBinaryString(n);
		if(res.length()<2)return true;
		for (int i = 0; i <res.length()-1 ; i++) {
			if(res.charAt(i)==res.charAt(i+1))return false;
		}
		return true;
	}
}
