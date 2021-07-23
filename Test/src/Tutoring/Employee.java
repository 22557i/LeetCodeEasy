package Tutoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee extends Person{
    public int salary;
    public int Id;
    public Employee(String name,int age, int salary, int Id ){
        super(age,name);
        this.salary = salary;
        this.Id = Id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", Id=" + Id +
                '}';
    }

    public void print(){
        System.out.println("This is an employee");
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(5);

        System.out.println(list.get(1));

    }

}