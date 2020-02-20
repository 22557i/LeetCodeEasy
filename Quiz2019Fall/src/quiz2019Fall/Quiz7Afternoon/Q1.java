package quiz2019Fall.Quiz7Afternoon;

/**
 * Created by Hao Wu on 11/5/19.
 */
public class Q1 {
}
class comma_operator
{
    public static void main(String args[])
    {
        int sum = 0 ;
        for ( int i = 0 , j = 0 ; i < 5 & j < 5 ; ++i, j = i + 1 )
            sum += i;
        System.out.println(sum);
    }
}
