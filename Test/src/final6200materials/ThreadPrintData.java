package final6200materials;

import java.util.concurrent.CountDownLatch;

public class ThreadPrintData {

	//public static CountDownLatch latch = new CountDownLatch(2);
	private static byte [] lock = new byte[0];
	private static volatile Integer i = 0;
	private static volatile Integer j =0;
	private static volatile boolean flag = true;
	private static final int TOTAL = 25;


	public static void main(String[] args) {

		Thread thread1 = new Thread() {

			@Override
			public void run() {
				while (i <= TOTAL) {
					synchronized (lock) {
						if (flag) {
							System.out.print( (char)('a'+(i++)));
							flag = false;
						} else {
							lock.notifyAll();
							try {
								if(i <= TOTAL){
									lock.wait();
								}
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}

				}
			}
		};
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				while (i <= TOTAL) {
					synchronized (lock) {
						if (!flag) {
							System.out.print((char)('A'+(j++)));
							flag = true;
						} else {
							lock.notifyAll();
							try {
								if(i < TOTAL){
									lock.wait();
								}
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}

				}
			}
		};
		thread1.start();
		thread2.start();
	}
}
