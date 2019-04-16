package asd;

public class Capital extends Thread {
	Myprint my = null;

	public Capital(Myprint my) {
		this.my = my;
	}

	@Override
	public void run() {
		my.Da();//打印大写
	}
}
