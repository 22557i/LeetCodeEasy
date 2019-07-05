package lcwu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution507 {
	public boolean checkPerfectNumber(int num) {
		int sum=0;
		for(Integer a:divisors(num)){
			sum+=a;
		}
		return sum==num;
	}

	public Set<Integer>divisors(int num){

		if (num==1)return new HashSet<>(Arrays.asList(1));
		Set<Integer>res = new HashSet<>(Arrays.asList(1,num));
		for (int i = 1; i <num ; i++) {
			if(num%i==0&&!res.contains(i))res.add(i);

		}
		return res;

	}

	public static void main(String[] args) {
		int test = 99999996;
		Solution507 solution507 = new Solution507();
		System.out.println(solution507.checkPerfectNumber(test));
	}
}
//	public boolean checkPerfectNumber(int num) {
//        /*
//        利用求所有因子的方式，i从2开始直到 sqrt(num)，计算 num % i是否无余数且i<num/i（防止重复计算，比如 4*7, 7*4），如果是，累加total
//        最后比较total与num是否相等，记得total还要+1，因为i是从2开始的。
//        */
//		if (num==1) return false;
//		int i=2, j=num/2;
//		int total = 0;
//		while(i<=num/i){
//			if (num%i==0 && i<num/i) total +=i+num/i;
//			i++;
//		}
//		return total+1==num;
//	}