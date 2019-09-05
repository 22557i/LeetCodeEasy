package lcwu;

public class Solution788 {
	public int rotatedDigits(int N) {

		boolean isGood = false;
		int num = 1, count = 0, x, rem;
		while(num <= N){

			isGood = false;
			x = num;
			while(x > 0){

				rem = x %10;
				x = x /10;
				if(rem == 3 || rem == 4 || rem == 7){
					isGood = false;
					break;
				}else if(rem == 2 || rem == 5 || rem == 6 || rem == 9){
					isGood = true;
				}
			}

			if(isGood){
				count++;
			}
			num++;
		}
		return count;
	}
}
