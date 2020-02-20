package Quiz2;

/**
 * Created by Hao Wu on 1/30/20.
 */
public class Q4 {
}
class NumberGame {

    public static void main(String[] args){
        int[] numbers = {10,20,30,40,50,60,70,80,90};

        for (int x : numbers){

            if(x==30 ||x==60||x==90||x==120) continue;

            System.out.print(x+" ");

            continue;

        }

    }

}