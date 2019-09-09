
public class Solution840 {
	public int numMagicSquaresInside(int[][] grid) {
		int A = grid.length;
		int count =0;
		for (int i = 0; i < A-3; i++)
			for (int j = 0; j <A-3 ; j++)
				if(grid[i][j]+grid[i][j+1]+grid[i][j+2]==15)
				if(grid[i+1][j]+grid[i+1][j+1]+grid[i+1][j+2]==15)
					if(grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2]==15)
						if(grid[i][j]+grid[i+1][j]+grid[i+2][j]==15)
							if(grid[i][j+1]+grid[i+1][j+1]+grid[i+2][j+1]==15)
								if(grid[i+2][j+2]+grid[i+1][j+2]+grid[i][j+2]==15)
					if(grid[i][j]+grid[i+1][j+1]+grid[i+2][j+2]==15)
					if(grid[i+2][j]+grid[i+1][j+1]+grid[i][j+2]==15)
						count++;

		return count;
	}
}
