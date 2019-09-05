package Huawei;

public class Solution1 {
	public int[] sellnum(float D){
		int M=0;
		int N =0;
		int d =(int)D/1;
		d = d+1-D>=D-d?d:d+1;
		if((D*10000/d)%1>0.5)M=(int)(D*10000/d)%1+1;
		else M=(int)(D*10000/d)%1;
		N = M*d;
		return new int[]{M,N};
	}
}
