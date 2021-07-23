package syl.E0425;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * File Name: GrowORShrinkTest.java 
 * @author Jagadeesh Vasudevamurthy
 * @year 2020
 */

/************************************************************
						NOTHING CAN BE CHANGED IN THIS FILE
 *************************************************************/
class GrowORShrinkTest {
	private boolean show = true ; 
	private boolean grow = false ;
	private IntUtil u = new IntUtil() ;
	GrowORShrinkTest() {
		testBed() ;
	}

	private void testBed() {
		System.out.println("------------Testing Shrink STARTS-----") ;
		grow = false ;
		testShrink() ;
		testOrder() ;
		System.out.println("------------Testing Shrink FINISHED-----") ;
		
		System.out.println("------------Testing GROW STARTS-----") ;
		grow = true ;
		testGrow() ;
		testOrder() ;
		
		System.out.println("------------Random Tests Starts-----") ;
		randomTests();
		System.out.println("------------Random Tests Finished-----") ;
	}
	
	private void test1(int a[], int eans) {
		int[] copyA = u.copyArray(a);
		int n = a.length;
		if (show) {
			System.out.println("-----------------------------------") ;
			if (n < 20 ) {
				u.pLn(n);
				u.pLn(a);
			}
		}
		int [] ans1 = {0} ;
		double [] work1 = {0} ;
		String [] s = {"Shrink","grow"};
		if (true) {
			int x = grow ? 1:0 ;
			System.out.println("--------- nSquareTime_constantSpace alg -------" + s[x]) ;	
		}
		long startTime = System.nanoTime();
		GrowORShrink h1 = new GrowORShrink(a,grow,ans1,work1,show,"nSquareTime_constantSpace alg");
		long endTime = System.nanoTime();
		double d = u.timeInSec(endTime,startTime) ;
		if (show) {
			System.out.println("Work done = " + work1[0]);	
		}else {
			System.out.println("O(n^2)Time O(1)Space Alg.  n = " + n + " Work = " + work1[0]  + " CPU = " + d + " secs") ;  
		}
		if ((eans != -1) && (ans1[0] != eans)) {
			System.out.println("Your answer is = " + ans1[0] + " But expected answer = "+  eans);	
			u.myassert(false);
		}
		int [] ans2 = {0} ;
		double [] work2 = {0} ;
		if (show) {
			System.out.println("--------- nTime_nSpace alg -------") ;	
		}
		startTime = System.nanoTime();
		GrowORShrink h2 = new GrowORShrink(copyA,grow,ans2,work2,show,"nlognTime_nSpace alg");
		endTime = System.nanoTime();
		d = u.timeInSec(endTime,startTime) ;
		if (show) {
			System.out.println("Work done = " + work2[0]);	
		}else {
			System.out.println("O(nlogn)Time O(n)Space Alg.  n = " + n + " Work = " + work2[0]  + " CPU = " + d + " secs") ;  
		}
		if ((eans != -1) && (ans2[0] != eans)) {
			System.out.println("Your answer is = " + ans2[0] + " But expected answer = "+  eans);	
			u.myassert(false);
		}
		u.myassert(ans1[0] ==ans2[0]) ;
	}
	
	private void testShrink() {
		{
			int a[] = {2,7,4,1,8,1};
			int s = 1 ;
			test1(a,s);
		}
		
		{
			int a[] = {1,2,3,4,5,6};
			int s = 1 ;
			test1(a,s);
		}
		{
			int a[] = {6,5,4,3,2,1};
			int s = 1 ;
			test1(a,s);
		}
		
		{
			int a[] = {600,10, 687, 78, 47,1};
			int s = 27 ;
			test1(a,s);
		}
		
		{
			int a[] = {1};
			int s = 1 ;
			test1(a,s);
		}
		
		{
			int a[] = {1,1,1,1,1,1};
			int s = 0 ;
			test1(a,s);
		}
		{
			int a[] = {1,1,1,1,1};
			int s = 1 ;
			test1(a,s);
		}
		
		{
			int a[] = {100,2,1089, 9999, 37,78,167,190,451,1024,586,628,1,2,0,7856};
			int s = 18 ;
			test1(a,s);
		}
	}
	
	private void testGrow() {
		{
			int a[] = {2,7,4,1,8,1};
			int s = 9 ;
			test1(a,s);
		}
		
		{
			int a[] = {1,2,3,4,5,6};
			int s = 7 ;
			test1(a,s);
		}
		{
			int a[] = {6,5,4,3,2,1};
			int s = 7 ;
			test1(a,s);
		}
		
		{
			int a[] = {600,10, 687, 78, 47,1};
			int s = 688 ;
			test1(a,s);
		}
		
		{
			int a[] = {1};
			int s = 1 ;
			test1(a,s);
		}
		
		{
			int a[] = {1,1,1,1,1,1};
			int s = 4 ;
			test1(a,s);
		}
		{
			int a[] = {1,1,1,1,1};
			int s = 4 ;
			test1(a,s);
		}
		
		{
			int a[] = {100,2,1089, 9999, 37,78,167,190,451,1024,586,628,1,2,0,7856};
			int s = 10000 ;
			test1(a,s);
		}
	}
	
	private void testOrder() {
		int N = 100 ;
		
		int []a = u.generateNumberInIncreasingOrder(N, 5) ;
		test1(a,-1);
		
		a = u.generateNumberInDescendingOrder(N, 4) ;
		test1(a,-1);
	}
	
	private void randomTests() {
  	show = false ;
  	int N = 500000; //500000 500000
    for (int i = 100000; i < N; i = i + 100000) {
    	
    	{
	    	int start = 0 ;
				int end = i-1 ; ;
				int [] b = u.generateRandomNumber(i, true, start,end);
				grow = false;
				test1(b,-1);
				grow = true;
				test1(b,-1);
    	}
    }
    System.out.println(N + " Random tests passed");
  }


	public static void main(String[] args) {
		//Change path below
		String s = "C:\\Users\\jag\\OneDrive\\vasu\\work\\leetcode\\exam\\GrowORShrinkoutput.txt";
		if (false) { //Make it to true to write to a file
			System.out.println("Writing to file" + s) ;
			try {
				System.setOut(new PrintStream(new FileOutputStream(s)));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Exam problem STARTS");
		GrowORShrinkTest m = new GrowORShrinkTest();
		System.out.println("Attach output file " + s) ;
		System.out.println("You are genius. If you liked my course and if you think you have learned something") ;
		System.out.println("Can you write on LinkedIn at: https://www.linkedin.com/in/jagadeesh-vasudevamurthy-6796591/");
		System.out.println("Exam ENDS");
	}
}
