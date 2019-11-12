package Quiz4Morning;

/**
 * Created by Hao Wu on 10/18/19.
 */
class Testx {
    static int x = 10;
    static {
        System.out.print("static1 ");
    }
    static {
        System.out.print("static2 ");
    }
    public static void main(String[] args) {
        Testx t1 = new Testx();
        Testx t2 = new Testx();

        t1.x = 20;
        System.out.print(t1.x + " ");
        System.out.println(t2.x);
    }
}
