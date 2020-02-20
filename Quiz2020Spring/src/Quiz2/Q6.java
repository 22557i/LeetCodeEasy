package Quiz2;

/**
 * Created by Hao Wu on 1/30/20.
 */
public class Q6 {
    public static void main(String[] args) {
        double discount=-1;
        char code ='B';

        switch(code){
            case 'A':
                discount = 0.0;
            case 'B':
                discount = 0.1;
            case 'C':
                discount = 0.2;
            case 'D':
                discount = 0.3;
        }
        System.out.println(discount);
    }
}
