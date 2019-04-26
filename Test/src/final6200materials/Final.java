package final6200materials;


import java.util.*;

public class Final {

	/**
	 * Final exam programming assignment:
	 * <p>
	 * Given a Driver class with a main method which only executes Final.demo(),
	 * And given this Final class (without my working solutions) with the supplied demo() method.
	 * Student must implement:
	 * <p>
	 * sortingTest() method in Final class
	 * alphaThreadsTest() method in Final class
	 * <p>
	 * and demonstrate by executing the following supplied demo() from Driver.
	 */
	public static boolean flag = false;

	public static void demo() {
		Final obj = new Final();

		obj.sortingTest();
		obj.alphaThreadsTest();
	}


	/**
	 * 80 TOTAL POINTS sortingTest:
	 * <p>
	 * 20 POINTS: ALL OUTPUT MUST BE DISPLAYED ON STANDARD OUTPUT USING ONLY '*' CHARACTERS, e.g. 1=*, 3=***
	 * <p>
	 * Given the supplied data array:  Integer [] data = {5,1,4,2,3};
	 * <p>
	 * 10 POINTS: Sort initial data ascending and DISPLAY on standard output.
	 * 10 POINTS: Sort initial data descending and DISPLAY on standard output.
	 * <p>
	 * 10 POINTS: Sort initial data OFFSET by 10 ascending and DISPLAY on standard output.
	 * 10 POINTS: Sort initial data OFFSET by 10 descending and DISPLAY on standard output.
	 * <p>
	 * 10 POINTS: Sort initial data SCALED by 10 ascending and DISPLAY on standard output.
	 * 10 POINTS: Sort initial data SCALED by 10 descending and DISPLAY on standard output.
	 * .
	 */
	public void sortingTest() {
		System.out.println("\n\t" + this.getClass().getName() + ".sortingTest() starting... \n");

		Integer[] data = {5, 1, 4, 2, 3};

		List<Integer> ints = new ArrayList<>(Arrays.asList(data));

		Collections.sort(ints, new Comparator<Integer>() {
			public int compare(Integer i, Integer j) {
				return i.compareTo(j);
			}
		});
		for (int i : ints) {

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
		Collections.sort(ints, new Comparator<Integer>() {
			public int compare(Integer i, Integer j) {
				return j.compareTo(i);
			}
		});
		for (int i : ints) {

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("");

		ListIterator<Integer> it = ints.listIterator();
		while (it.hasNext()) {
			it.set(it.next() + 10);
		}

		Collections.sort(ints, new Comparator<Integer>() {
			public int compare(Integer i, Integer j) {
				return i.compareTo(j);
			}
		});
		Collections.sort(ints,((o1, o2) -> {return Integer.compare(o1,o2);}));
		for (int i : ints) {

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("");

		Collections.sort(ints, new Comparator<Integer>() {
			public int compare(Integer i, Integer j) {
				return j.compareTo(i);
			}
		});

		for (int i : ints) {

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("");

		List<Integer> ints2 = new ArrayList<>(Arrays.asList(data));
		ListIterator<Integer> it2 = ints2.listIterator();
		while (it2.hasNext()) {
			it2.set(it2.next() * 10);
		}

		Collections.sort(ints2, new Comparator<Integer>() {
			public int compare(Integer i, Integer j) {
				return i.compareTo(j);
			}
		});

		for (int i : ints2) {

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("");

		Collections.sort(ints2, new Comparator<Integer>() {
			public int compare(Integer i, Integer j) {
				return j.compareTo(i);
			}
		});

		for (int i : ints2) {

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("\n" + this.getClass().getName() + ".sortingTest() done! \n");

	}

	/**
	 * 20 TOTAL POINTS: alphaThreadsTest
	 * <p>
	 * Using TWO threads, t1 and t2: WHERE t1 output to console entire alphabet in
	 * order in LOWERCASE, alternating with t2 output; WHERE t2 output to console
	 * entire alphabet in order in UPERCASE, alternating with t1 output; TO RESULT
	 * IN two threads with coordinated console output as follows:
	 * <p>
	 * aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ
	 */
	public void alphaThreadsTest() {
		System.out.println("\n\t" + this.getClass().getName() + ".alphaThreads() starting...\n");
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		String ualpha = alpha.toUpperCase();
		String[] al = alpha.split("");
		String[] ual = ualpha.split("");
		List<String> lower = Arrays.asList(al);

		List<String> upper = new ArrayList<>();
		for (int i = 0; i < lower.size(); i++) {
			upper.add(lower.get(i).toUpperCase());
		}

		//String x= alpha;
		//Runnable r1 = () -> System.out.print(x);
		//String y =alpha.toUpperCase();
		//Runnable r2 = () -> System.out.print(y);


		/*Thread t1 = new Thread(() -> {
			for (int i = 0; i < 26; i++) {
				if (!flag) {
					try {
						System.out.print(al[i]);
						Thread.sleep(100);// 防止打印速度过快导致混乱
					} catch (InterruptedException e) {
						//NO
					}


					flag = true;
				}
			}
		}
		);

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 26; i++) {
				if (flag) {
					try {
						System.out.print(al[i].toUpperCase());
						Thread.sleep(100);// 防止打印速度过快导致混乱
					} catch (InterruptedException e) {
						//NO
					}


					flag = false;
				}
			}
		}
		);

		t1.start();
		t2.start();
*/
		Myprint mp = new Myprint();
		new Lowercase(mp).start();
		new Capital(mp).start();

	}

}

/*
	edu.neu.csye6200.Final.sortingTest() starting... 

*
**
***
****
*****

*****
****
***
**
*

***********
************
*************
**************
***************

***************
**************
*************
************
***********

**********
********************
******************************
****************************************
**************************************************

**************************************************
****************************************
******************************
********************
**********

edu.neu.csye6200.Final.sortingTest() done! 


	edu.neu.csye6200.Final.alphaThreads() starting...

nullnull*/
