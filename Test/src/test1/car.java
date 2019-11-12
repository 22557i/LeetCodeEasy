package test1;

import java.io.IOException;

/**
 * Created by Hao Wu on 10/9/19.
 */
public class car {
    public car() throws IOException {
        System.out.println("here is a car");
        throw new IOException();
    }
}
