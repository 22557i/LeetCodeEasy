package Quiz4Afternoon;

/**
 * Created by Hao Wu on 10/15/19.
 */
public class Q5 {
}
class Balloon{
    private String color;
    public Balloon(){}

    public Balloon(String c){
        this.color = c;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    private static void foo(Balloon balloon){
        balloon.setColor("Red");
        balloon = new Balloon("Green");
        balloon.setColor("Blue");
    }
    public static void swap(Balloon o1,Balloon o2){
        Balloon temp = o1;
        o1 = o2;
        o2 =temp;
    }

    public static void main(String[] args) {
        Balloon red = new Balloon("Red");
        Balloon blue = new Balloon("Blue");
        swap(red,blue);
        System.out.println("red color="+red.getColor());
        System.out.println("blue color="+blue.getColor());
        foo(blue);
        System.out.println("blue color="+blue.getColor());
    }
}
