package Quiz6Afternoon;

/**
 * Created by Hao Wu on 11/2/19.
 */
public class Q5 {
}
class A {
    A() {
        System.out.println("class A constructor");
    }
}

class B extends A{
    B() {
        System.out.println("class B constructor");
    }
}
 class Test1 {
    public static void main(String[] args) {
        A a = new B();
    }
}

