package lcwu;

public class Solution1103 {
	public int[] distributeCandies(int candies, int num_people) {

		int[] res = new int[num_people];
		int round = 0;

		while (candies > 0) {
			for (int i = 0; i < num_people; i++) {
				if (candies >= i + 1 + num_people * round) {
					res[i] += i + 1 + num_people * round;
					candies -= i + 1 + num_people * round;
				} else {
					res[i] += candies;
					candies = 0;
					return res;
				}
			}
			round++;
		}
		return res;
	}
}
