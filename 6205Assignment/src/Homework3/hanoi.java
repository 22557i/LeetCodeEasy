package Homework3;

/**
 * Created by Hao Wu on 9/23/19.
 */
public class hanoi {
    public static void main(String[] args){
        hanoi h = new hanoi();
        h.move(5, 'A', 'B', 'C');
    }
    public void move(int n,char a,char b,char c){
        if(n == 1){
            System.out.println("Disk "+n+" From "+a+" To "+c);
        }else{
            move(n - 1,a,c,b);
            System.out.println("Disk "+(n)+" From "+a+" To "+c);
            move(n - 1,b,a,c);
        }
    }
}