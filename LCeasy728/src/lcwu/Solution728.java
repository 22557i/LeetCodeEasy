package lcwu;

import java.util.*;
public class Solution728 {
	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> res = new LinkedList<>();
		for (int i = left; i <=right ; i++) {
			if(isselfDividing(i))res.add(i);
		}
		return res;
	}
	public boolean isselfDividing(int num){
		List<Integer>temp = new ArrayList<>();
		int num2 = num;
		while(num>0){
			temp.add(num%10);
			num=num/10;
		}
		if(temp.contains(0))return false;
		for (Integer a:temp){
			if(num2%a!=0)return false;
		}
		return true;
	}
}
