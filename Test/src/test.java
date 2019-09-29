/**
 * Created by Hao Wu on 9/28/19.
 */


import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>() ;
        list.add( "A" );
        list.add( "B" );
        list.add( "C" );
        list.add( "D" );
        list.add( "E" );
        list.set( list.indexOf("C"), "R" );
        System.out.println(list);
    }
}
