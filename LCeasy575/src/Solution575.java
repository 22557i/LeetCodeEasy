import java.util.HashSet;

public class Solution575 {
	public int distributeCandies(int[] candies) {
		HashSet set = new HashSet();
		for(int a:candies){
			set.add(a);

		}
		if(set.size()>=candies.length/2)return candies.length/2;
		else return set.size();
	}
}
