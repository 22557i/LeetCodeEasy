import java.util.LinkedList;

public class Solution566 {
	public int[][] matrixReshape(int[][] nums, int r, int c) {
		if(nums.length*nums[0].length!=r*c)return nums;

		LinkedList<Integer>templist = new LinkedList<>();
		for(int[] a:nums){
			for(int n:a){
				templist.add(n);
			}
		}
		int[][]res = new int[r][c];
		for (int i = 0; i <r ; i++) {
			for (int j = 0; j < c; j++) {
				res[i][j] = templist.remove();
			}
		}
		return res;
	}
}
