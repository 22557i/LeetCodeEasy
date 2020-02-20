package test;

import java.util.ArrayList;
import java.util.List;

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
        List<Integer> l = new ArrayList<>();
        for(int i=1;i<121;++i)
            if((i%2!=0)&&(i%5!=0)&&(i%7!=0))l.add(i);

        System.out.println(l.size());
    }
}
