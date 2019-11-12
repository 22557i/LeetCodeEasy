package Quiz7Morning;

/**
 * Created by Hao Wu on 11/9/19.
 */
public class Q6 {
    interface Employee {}
 interface Printable extends Employee {
         String print();
        }
 class Programmer {
       String print() { return("Programmer - Mala Gupta"); }
        }
   class Author extends Programmer implements Printable, Employee {
        public String print() { return("Author - Mala Gupta"); }
       }

}
