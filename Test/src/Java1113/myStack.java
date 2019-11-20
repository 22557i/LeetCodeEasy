package Java1113;

/**
 * Created by Hao Wu on 11/19/19.
 */
public class myStack {
    private int[]data = new int[0];
    private int top = -1;
    public void push(int x){
        int[]temp = new int[this.data.length+1];
        for(int i =0;i<this.data.length;++i)
            temp[i] = this.data[i];
        temp[++top] = x;
        this.data =temp;
    }
    public int pop(){
        int result = this.data[top--];
        int []temp = new int[this.data.length-1];
        for(int i =0;i<temp.length;++i){
            temp[i] = this.data[i];
        }
        this.data = temp;
        return result;
    }
    public int peek(){
        return this.data[top];
    }
    public int size(){return this.data.length;}
    public boolean isEmpty(){return this.size()==0;}

    public static void main(String[] args) {
        myStack ms = new myStack();
        ms.push(1);
        ms.push(2);
        ms.push(3);
        while (!ms.isEmpty()) {
            System.out.println(ms.isEmpty());
            System.out.println(ms.pop());

        }

        System.out.println(ms.isEmpty());

    }

}
