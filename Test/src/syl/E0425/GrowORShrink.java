package syl.E0425;
/**
 * File Name: GrowORShrink.java 
 * @author Jagadeesh Vasudevamurthy
 * @year 2021
 */


import com.sun.tools.javac.comp.LambdaToMethod;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/************************************************************
			WRITE CLASS GrowORShrink
 *************************************************************/
class GrowORShrink {
	private int[] objects;
	private boolean grow ;
	private int[] ans;
	private double[] work;
	
	private boolean show ;
	//YOU CAN HAVE ANY NUMBER OF PRIVATE VARIABLES and FUNCTIONS
	private int steps = 0 ;

	GrowORShrink(int[] objects, boolean grow,int[] ans, double[] work, boolean show, String s) {
		this.objects = objects ;
		this.grow = grow ;
		this.ans = ans ;
		this.work = work ;
		this.show = show ;
		if (s == "nSquareTime_constantSpace alg") {
			nSquareTimeConstantSpace() ;
		}else if (s == "nlognTime_nSpace alg") {
			nlognTimenSpace() ;
		}
	} 
	
	private void incrementWork() {
		work[0] += 1 ;
	}
	
	private void setAns(int s) {
		ans[0] = s ;
	}

	//WTITE YOUR CODE BELOW
	//YOU CAN HAVE ANY NUMBER OF PRIVATE VARIABLES and FUNCTIONS
	
	private void myassert(boolean  x) {
		if (!x) {
			throw new IllegalArgumentException("Assert fail") ;
		}
	}

	/*
	 * TIME: O(n^2)
	 * SPACE: THETA(1)
	 */
		
	private void nSquareTimeConstantSpace() {
		int n = objects.length ;
		//WRITE CODE
		bubbleSort(objects,0);


		for (int i = 1; i < n; i++) {
			objects[i] =(grow? Math.max(objects[i],objects[i-1])+1:Math.abs(objects[i]-objects[i-1]));
			if(!grow)bubbleSort(objects,i);
			else Arrays.sort(objects,i,n);
		}

		setAns(objects[n-1]);
		incrementWork();

	}

	/*
	 * TIME: O(nlogn)
	 * SPACE: O(n)
	 */
	private void nlognTimenSpace() {
		int n = objects.length ;
		PriorityQueue<Integer>pq = new PriorityQueue<>((a1,a2)->grow? a1-a2:a2-a1);
		for (int num:objects)pq.add(num);
		while(pq.size()>1){
			int n1 = pq.poll();
			int n2 = pq.poll();
			int temp;
			if(grow) temp = Math.max(n1,n2)+1;
			else temp = Math.abs(n1-n2);
			pq.add(temp);
		}
		setAns(pq.peek());
		incrementWork();
	}
	private void bubbleSort(int[] arr,int start) {
		for (int i = start; i < arr.length - 1; i++) {
			for (int j = start; j < arr.length - i -1; j++) {
				if(!grow) {
					if (arr[j] <= arr[j + 1]) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				}
				else {
					if (arr[j] > arr[j + 1]) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Run GrowORShrinkTest.java");
	}
}


