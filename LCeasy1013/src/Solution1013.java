import java.util.Arrays;

public class Solution1013 {
	public boolean canThreePartsEqualSum(int[] A) {
		int sum=Arrays.stream(A).sum();
		if(Arrays.stream(A).sum()%3!=0)return false;
		int index1=0;
		int index2=0;
		for (int i = 1; i < A.length; i++) {
			if(Arrays.stream(Arrays.copyOfRange(A,0,i)).sum()==sum/3){
				index1 =i;
				break;
			}
		}
		if(index1==0||index1 ==A.length-1)return false;
		else{
			for (int i = index1; i <A.length ; i++) {
				if(Arrays.stream(Arrays.copyOfRange(A,index1,i)).sum()==sum/3){
					index2 =i;
					break;
				}
			}
			if(index2==0)return false;
		}
		return Arrays.stream(Arrays.copyOfRange(A,index2,A.length)).sum()==sum/3;
	}
}
