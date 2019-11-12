package assignment2;
/**
 * 
 * author : Hao Wu
 */
public class Requriement2 {
	public void constant1(){
		int i =1;
	}
	public void logN(int N){
		N = 100;
		while(N>1){
			N = N/2;
		}
	}
	public void N (int N){
		int n =100;
		for (int i = 0; i <N ; i++) {
			System.out.println(i);
		}
	}
	public void NlogN(int n[]){
		// in class MergeSort below
	}
	public void N2(int n[]){
		int count =0;
		for (int i = 0; i <n.length ; i++) {
			for (int j = 0; j < n.length; j++) {
				count+=n[j];
			}
		}
	}
	public void N3(int n[]){
		int count=0;
		for (int i = 0; i <n.length ; i++) {
			for (int j = 0; j <n.length ; j++) {
				for (int k = 0; k < n.length; k++) {
					count +=n[k];
				}
			}
		}
	}
	public int fibonacci(int N){
		if(N<1)return 0;
		if(N==1)return 1;
		if(N==2)return 1;
		return fibonacci(N-1)+fibonacci(N-2);
		//O(2^N)
	}
}

class NlogN_MergeSort{
	private static int[] aux;

	public static void sort(int[] a) {
			
		aux = new int[a.length];
		sort(a, 0, a.length - 1);
	}

	public static void sort(int[] a, int low, int high) {
		if (low >= high) {
			return;
		}
		int mid = (low + high) / 2;
		
		sort(a, low, mid);
		sort(a, mid + 1, high);
		merge(a, low, mid, high);
	}


	public static void merge(int[] a, int low, int mid, int high) {
	
		int i = low, j = mid + 1;
		for (int k = low; k <= high; k++) {
			aux[k] = a[k];
		}

		for (int k = low; k <= high; k++) {
			if (i > mid) {
				a[k] = aux[j++];
			} else if (j > high) {
				a[k] = aux[i++];
			} else if (aux[j] < aux[i]) {
				a[k] = aux[j++];
			} else {
				a[k] = aux[i++];
			}
		}
	}

}
