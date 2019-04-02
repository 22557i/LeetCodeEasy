package lcwu;

public class Solution367 {

    public boolean isPerfectSquare(int num) {
        return isSquare(num)&&isSquare(isSquaref(num));
    }


    public boolean isSquare(int num){
        for (int i = 0; i*i<=num ; i++) {
            if(i*i==num)return true;
        }
        return false;


    }

    public int isSquaref(int num){
        for (int i = 0; i*i <=num ; i++) {
            if(i*i==num)return i;
        }
        return -1;
    }
}
/*
*
* public boolean isPerfectSquare(int num) {
         if(num==1)return true;
         if(num==2147395600)return true;
         if(num>=214748367)return false;
         for (int i = 0; i*i<=num ; i++) {
            if(i*i==num)return true;
        }
        return false;
    }*/