package quiz2019Fall.Quiz6Afternoon;

/**
 * Created by Hao Wu on 11/2/19.
 */

class A {
    A() {
        System.out.print("class A constructor ");
    }
}

class B extends A{
    B() {
        System.out.print("class B constructor ");
    }
}
class Q5 {
    public static void main(String[] args) {
        A a = new B();
    }
}

