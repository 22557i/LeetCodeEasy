package asd;

public class Myprint implements  Runnable{
	boolean flag = true;
	int i = 0;
	int j = 0;

	public void Xiao() {

		while (i < 26) {
			if (flag) {
				System.out.print((char) ('a' + i));
				i++;
				this.flag = false;
			}
		}
	}

	public void Da() {

		while (j < 26) {
			if (!flag) {
				System.out.print((char) ('A' + j));
				j++;
				this.flag = true;
			}
		}

	}
	public void run(){
		Xiao();
		Da();
	}
}
