/**
 * Created by Hao Wu on 11/12/19.
 */
public class Solution246 {
    public boolean isStrobogrammatic(String num) {
        if(num.length()==1){
            if(num.equals("1")||num.equals("0")||num.equals("8"))return true;
            else return false;
        }
        if(num.contains("2")||num.contains("3")||num.contains("4")||num.contains("5")||num.contains("7"))return false;
        char[]set = num.toCharArray();
        int l = 0;
        int r = num.length()-1;
        while(l<r){
            if(set[l]=='6'){
                if(set[r]!='9')return false;
            }
            if(set[l]=='9'){
                if(set[r]!='6')return false;
            }
            if(set[l]=='1'||set[l]=='0'||set[l]=='8')
                if(set[l]==set[r])return true;
                else return false;
            l++;
            r--;
        }
        return true;
    }
}
