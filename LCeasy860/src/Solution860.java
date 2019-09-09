public class Solution860 {
	public boolean lemonadeChange(int[] bills) {
	int[]count = new int[3];
		for (int i = 0; i <bills.length ; i++) {
			if(bills[i]==5)count[0]++;
			else if (bills[i]==10){
				count[0]--;
				count[1]++;
			}else{
				if(count[1]>0&&count[0]>0){
					count[0]--;
					count[1]--;
				}else count[0]-=3;
			}
			if(!checkstatus(count))return false;
		}
		return true;
	}
	public boolean checkstatus(int[]A){
		for(int n:A){
			if(n<0)return false;
		}
		return true;
	}
}
