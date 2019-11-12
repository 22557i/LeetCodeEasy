package Homework2.src.assignment2;
/**
 * 
 * author : Hao Wu
 */
public class Requirement3 {
	public int N3(int n[]){
		int count =0;
		for (int i = 0; i <n.length ; i++) {
			for (int j = i+1; j < n.length; j++) {
				for (int k = j+1; k <n.length ; k++) {
					if(n[i]+n[j]+n[k]==0)count++;
				}
			}
		}
		return count;
	}
	public static void main(String args[]) {
		int n[]= {1,2,3,3,-2,-3,-1,-1,2,1,3};
		Requirement3 r3 = new Requirement3();
		System.out.println(r3.N3(n));
	}
}
