public class Solution849 {
		public int maxDistToClosest(int[] seats) {
			int ans = 1;
			int start = 0, end = 0;
			for (int i = 0; i<seats.length; i++){
				if(seats[i]==1) {
					start = i;
					break;
				}
			}
			ans = Math.max(ans,start);
			for ( int j = start+1; j<seats.length;j++){
				if (seats[j]==1) {
					ans = Math.max(ans,(j-start)/2);
					start = j;
				}
			}
			ans = Math.max(ans,seats.length-start-1);
			return ans;
		}
}
