package lcwu;

public class Solution1010 {
	public int numPairsDivisibleBy60(int[] time) {

		int count =0;
		int times[] = new int[60];
		for(int n:time){
			times[n%60]++;
		}
		count+=times[0]*(times[0]-1)/2;
		count+=times[30]*(times[30]-1)/2;
		for(int i =0;i<times.length;i++){
			if(times[i]!=0)System.out.println(i+" "+times[i]);
		}
		for (int i = 1; i < 30; i++) {
			count+=times[i]*times[60-i];
		}
		return count;
	}
}
