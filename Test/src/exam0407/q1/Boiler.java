package exam0407.q1;

import java.util.Scanner;

public class Boiler {
    private int capacity;
    private boolean on;

    public Boiler() {
        this.capacity = 100;
        this.on = false;
    }

    public Boiler(int capacity, boolean on) throws Exception {
        if(capacity<0) throw new Exception();
        this.capacity = capacity;
        this.on = on;
    }

    public boolean isOn() {
        return this.on;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public static Boiler read(Scanner sc) throws Exception {
        int cap = sc.nextInt();
        boolean isOn = sc.nextBoolean();
        return new Boiler(cap,isOn);
    }
}
