public class Solution868 {
	public int binaryGap(int N) {
		String s = Integer.toBinaryString(N);
		int count =0;
		int max =0;
		char[]cset =s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if(cset[i]=='1'){
				count=0;
				for (int j = i+1; j <s.length() ; j++) {
					count++;
					if(cset[j]=='1'){
						max=Math.max(count,max);
						break;
					}
				}
			}
		}
		return max;
	}
}
