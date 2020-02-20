package final6200materials;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo {
	public static byte [] lock = new byte[0];
	//public static volatile int j=0;
	//public static  volatile  int i=0;
	public static volatile int count =1;
	public static final int total =500;
	//public static volatile boolean flag = true;
	public static void main(String[] args) {
	Thread t1 = new Thread(){
		@Override
		public void run(){
			while(count<=total) {
				synchronized (lock) {
					if (count%3==0) {
						System.out.println("线程1：-----"+count++);
						//flag = false;
					} else {
						lock.notifyAll();
						try {
							if (count < total) {
								lock.wait();
							}
						}catch(InterruptedException e){
							e.printStackTrace();
						}
					}
				}
			}
		}
	};

		Thread t2 = new Thread(){
			@Override
			public void run() {
				while (count <= total)
					synchronized (lock) {
						if (count%3==1) {
							System.out.println("线程2：--------"+count++);

							//flag = true;
						}  else{
							lock.notifyAll();
							try {
								if (count < total) {

									lock.wait();
								}
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}

			}
		};
		Thread t3 = new Thread(){
			@Override
			public void run() {
				while (count <= total)
					synchronized (lock) {
						if (count%3==2) {
							System.out.println("线程3：------"+count++);

							//flag = true;
						}  else{
							lock.notifyAll();
							try {
								if (count < total) {

									lock.wait();
								}
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}

			}
		};

		ExecutorService excutor = Executors.newFixedThreadPool(3);
		excutor.execute(t1);
		excutor.execute(t2);
		excutor.execute(t3);
//		final6200materials
		if(count>total)return ;
	}
}
