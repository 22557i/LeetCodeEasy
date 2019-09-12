import java.util.*;

public class Solution970 {
	public List<Integer> powerfulIntegers(int x, int y, int bound) {
		Set<Integer> res = new HashSet<>();
		int a = 1;
		while(true){
			if(a >= bound) break;
			int b = 1;
			while(true){
				if(a+b <= bound)
					res.add(a+b);
				else
					break;
				b *= y;
				if(y == 1) break;
			}
			a *= x;
			if(x == 1) break;
		}
		return new ArrayList<>(res);
	}
}
