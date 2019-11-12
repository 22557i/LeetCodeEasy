package test1;

import java.io.IOException;

/**
 * Created by Hao Wu on 10/9/19.
 */
public class BWM extends car{

    public BWM() throws IOException {

        super();
        try {
            new BWM();
        }catch (IOException e){
            System.out.println("IOexception is throw");
        }

    }

    public static void main(String[] args) {

    }
}
