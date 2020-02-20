package quiz2019Fall.Quiz8;

/**
 * Created by Hao Wu on 11/16/19.
 */
public class AQ3 {
}
class Person{

    private void who(){
        System.out.println("Inside private method Person(who)");
    }
    public static void whoAmI(){
        System.out.println("Inside static method, Person(whoAmI)");
    }
    public void whoAreYou() {
        who();
        System.out.println("Inside virtual method, Person(whoAreYou)");
    }
}
class Kid extends Person {
    private void who() {
        System.out.println("Kid(who)");
    }
    public static void whoAmI() {
        System.out.println("Kid(whoAmI)");
    }
    public void whoAreYou() {
        who();
        System.out.println("Kid(whoAreYou)");
    }
}
class Driver {
    public static void main(String args[]) {
        Person p = new Kid();
        p.whoAmI();
        p.whoAreYou();
    }
}