package test;

/**
 * Created by Hao Wu on 10/3/19.
 */
public class dog1 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public dog1(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        dog1 aDog = new dog1("Bella");
        dog1 oldDog = aDog;
        changeName(aDog);
        System.out.println(aDog.getName().equals("Molly"));
        System.out.println(aDog==oldDog);
    }
    public static void changeName(dog1 d){
        System.out.println(d.getName().equals("Bella"));
        d.setName("Molly");

    }
}
