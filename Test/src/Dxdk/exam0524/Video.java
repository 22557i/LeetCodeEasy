package Dxdk.exam0524;

public class Video extends Item{
    public Video(String title){
        super(title,0.55);
    }

    public static long mystery(int n){
        int res =1 ;
        for(; n >1;n--){
            res*=2;
        }
        return res;
    }
}
