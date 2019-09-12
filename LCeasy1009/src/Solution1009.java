public class Solution1009 {
	public int bitwiseComplement(int N) {
		String s = Integer.toBinaryString(N);
	int count =0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='0')count+=Math.pow(2,s.length()-1-i);
		}
		return count;
	}
}
