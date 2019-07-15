public class Solution551 {
	public boolean checkRecord(String s) {
		int count[] = new int[128];
		char set[] = s.toCharArray();
		for(char c:set){
			count[c]++;
		}
		return (!s.contains("LLL")&&count['A']<=1);
	}
}
