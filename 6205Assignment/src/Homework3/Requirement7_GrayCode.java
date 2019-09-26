package Homework3;

/**
 * Created by Hao Wu on 9/24/19.
 */
public class Requirement7_GrayCode {
    public static StringBuffer[] n_gray(int n){
        int length = (int)Math.pow(2, n);
        StringBuffer[] sbArray = new StringBuffer[length];
        if(n==1){
            sbArray[0] = new StringBuffer("0");
            sbArray[1] = new StringBuffer("1");
        }else{
            StringBuffer[] temp = n_gray(n-1);
            for(int i=0;i<length;i++){
                if(i<length/2){
                    sbArray[i] = new StringBuffer(temp[i]);
                    sbArray[i].insert(0, "0");
                }else{
                    sbArray[i] = new StringBuffer(temp[length-i-1]);
                    sbArray[i].insert(0, "1");
                }
            }

        }

        return sbArray;
    }

    public static void main(String[] args) {
        int n = 4;
        StringBuffer[] res = n_gray(4);
        for (int i = 0; i <Math.pow(2,4); i++) {
            System.out.println(i+" is: "+res[i]);
        }
    }
}
