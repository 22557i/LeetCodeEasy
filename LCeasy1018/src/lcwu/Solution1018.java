package lcwu;

import java.util.*;

public class Solution1018 {
	public List<Boolean> prefixesDivBy5(int[] A) {
		long num=0;
		List<Boolean> list = new ArrayList<>();
		for(int i=0;i<A.length;i++)
		{
			num = (num*2 + A[i])%5;
			list.add(num==0);
		}
		return list;
	}
}
