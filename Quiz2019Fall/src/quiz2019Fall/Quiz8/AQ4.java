package quiz2019Fall.Quiz8;

/**
 * Created by Hao Wu on 11/16/19.
 */
public class AQ4 {
}
class Driver1
{
    public static void main(String args[])
    {
        try
        {
            System.out.println("First statement of try block");
            int num=45/3;
            System.out.println(num);
        }
        catch(Exception e)
        {
            System.out.println("Caught Exception");
        }
        finally
        {
            System.out.println("finally block");
        }
        System.out.println("Main method");
    }
}

