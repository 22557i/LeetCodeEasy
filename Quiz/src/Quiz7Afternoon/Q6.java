package Quiz7Afternoon;

/**
 * Created by Hao Wu on 11/5/19.
 */
public class Q6{

}
class Test6 {
    int a[] = new int[4];
    void aMethod()
    {
        int b = 0 , index;
        a[a[b]] = a[b] = b = 2;
        index = 2;
        System.out.println(a[index]);
    }

    public static void main(String[] args) {
       Test6 q = new Test6();
        q.aMethod();

    }
}
