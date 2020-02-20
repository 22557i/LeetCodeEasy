package test;

/**
 * Created by Hao Wu on 10/3/19.
 */
public class Dog {
    private String name;
    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        Dog aDog = new Dog("Bella");
        Dog oldDog = aDog;
        changeName(aDog);
        System.out.println(aDog.getName());
        System.out.println(aDog.getName().equals("Bella")); //True/False, why?
        System.out.println(aDog.getName().equals("Molly"));// True/False, why? a
        System.out.println( aDog == oldDog);; //True/False, why?
    }
    public static void changeName(Dog d) {
        System.out.println(d.getName().equals("Bella")); //True/False, why?
         d = new Dog("Molly");
        System.out.println(d.getName().equals("Molly"));
        System.out.println(d.getName());
    }
}
