package test1;

public class abccc {
    private static void helper(int l,int r){
        if(r>=l)return;
        if(l-r>0 && l-r>=r) System.out.println(r+" "+(l-r));
        helper(l,r+1);
    }

    public static void main(String[] args) {
        helper(8,1);
    }
}
