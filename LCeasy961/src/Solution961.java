public class Solution961 {
	public int repeatedNTimes(int[] A) {
		int count []= new int[10000];
		for (int n:A){
			count[n]++;
		}
		for (int n:A){
			if(count[n]==A.length/2)return n;
		}
		return -1;
	}
}
