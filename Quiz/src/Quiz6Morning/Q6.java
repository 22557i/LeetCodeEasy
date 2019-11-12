package Quiz6Morning;

/**
 * Created by Hao Wu on 10/30/19.
 */
public class Q6 {
    abstract static class Car {
        public void WhatsIt() {
            System.out.println("This is a car.");
        }
    }
    static class Ferrari extends Car {
        @Override
        public void WhatsIt() {
            System.out.println("This is a Ferrari.");
        }
    }
    static class Porsche extends Car {
        @Override
        public void WhatsIt() {
            System.out.println("This is a Porsche.");
        }
    }
    public static void main(String[] args) {
        Car c1 = new Ferrari();
        Porsche c2 = new Porsche();
        Car c3 = (Car)c2;
        c1.WhatsIt();
        c2.WhatsIt();
        c3.WhatsIt();
    }
}
