package exam0407.q2;

import exam0407.q1.Boiler;

import java.util.Scanner;

public class Application {
    private final static int SIZE = 5;
    public static void main(String[] args) throws Exception {
        Boiler[] boilers = new Boiler[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <SIZE ; i++) {
            boilers[i] = Boiler.read(sc);
        }

        System.out.println("Please input a capacity:");
        int cap = sc.nextInt();
        int count = 0;
        for (Boiler boiler: boilers) {
            if(boiler.getCapacity()>=cap)count++;
        }
        System.out.println("We have "+count+"boiler(s) whose capacity no less than "+cap);
    }
}
