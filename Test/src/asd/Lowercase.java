package asd;

public class Lowercase extends Thread {
	Myprint my = null;

	public Lowercase(Myprint my) {
		this.my = my;
	}

	@Override
	public void run() {
		my.Xiao();//打印小写
	}
}
