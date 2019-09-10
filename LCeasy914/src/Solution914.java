import java.util.*;

public class Solution914 {
	public boolean hasGroupsSizeX(int[] deck) {
		int N = deck.length;
		int max =0;
		for (int n:deck){
			max = Math.max(n,max);
		}
		int []count = new int[max+1];
		for (int n:deck){
			count[n]++;
		}
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i <max+1 ; i++) {
			if(count[i]>0)list.add(count[i]);
		}
		search:for (int i = 2; i <=N ; i++) {
			if(N%i==0){
				for(int v:list){
					if(v%i!=0)continue search;
				}
				return true;
			}
		}
		return false;
	}
}
