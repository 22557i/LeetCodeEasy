public class Solution892 {
	public int surfaceArea(int[][] grid) {
		int res = 0;
		for (int i = 0;i < grid.length;i++)
			for (int j = 0;j < grid[0].length;j++)
			{
				//if there is a non zero stack, add top and bottom area
				if (grid[i][j] != 0)
					res += 2;
				//compute upmost stacks
				if (i == 0)
					res += grid[i][j];
				//compute leftmost stacks
				if (j == 0)
					res += grid[i][j];
				//compute bottom stacks
				if (i == grid.length - 1)
					res += grid[i][j];
				//compute rightmost stacks
				if (j == grid[0].length - 1)
					res += grid[i][j];
				//compute stack in next row if possible
				if (i < grid.length - 1)
					res += Math.abs(grid[i][j] - grid[i + 1][j]);
				//compute stack in next column if possible
				if (j < grid[0].length - 1)
					res += Math.abs(grid[i][j] - grid[i][j + 1]);
			}
		return res;
	}
}
