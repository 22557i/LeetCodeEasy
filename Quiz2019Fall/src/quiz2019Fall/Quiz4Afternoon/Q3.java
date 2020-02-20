package quiz2019Fall.Quiz4Afternoon;

/**
 * Created by Hao Wu on 10/15/19.
 */
public class Q3 {
}
class MyStatic {
    static int x = 6;
    MyStatic() {
        x++;
    }
    void method() {
        System.out.print("-x" + x);
    }
    public static void main(String[] args) {
        MyStatic mc1, mc2, mc3, mc4;
        MyStatic mc5 = new MyStatic();
        MyStatic mc6 = new MyStatic();
        MyStatic mc7 = new MyStatic();
        mc7.method();
    }
}

