package quiz2019Fall.Quiz3Morning;

/**
 * Created by Hao Wu on 10/10/19.
 */
public class Q1 {
    public static void main (String []args){
        for(int i=0;  i<10; i++){
            if(i==4){
                System.out.print(i+ " ");
                break;
            }
            if(i ==2 || i ==4|| i ==6) {
                System.out.print(i + " ");
                continue;
            }
        }
    }

}
