package lab6;

import java.util.*;

/**
 * Created by Hao Wu on 10/19/19.
 */
public class Person {
    private int age;
    private String name;
    private double GPA;

    public Person(int age, String name, double GPA) {
        this.age = age;
        this.name = name;
        this.GPA = GPA;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", GPA=" + GPA +
                '}';
    }

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(20,"Harry",4.0));
        list.add(new Person(19,"Tom",3.1));
        list.add(new Person(22,"Amy",3.5));
        list.add(new Person(21,"Lily",3.7));
        for(Person p:list)
            System.out.println(p);
        Collections.sort(list, (o1,o2)->{return o1.getAge()-o2.getAge();});
        System.out.println("----------------------------------------");
        for(Person p:list)
            System.out.println(p);


    }


}
