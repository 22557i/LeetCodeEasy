package lcwu;
import java.util.*;
class Solution119 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> PTList = generate(rowIndex+1);
        return PTList.get(rowIndex);
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> Res = new ArrayList<>();
        if(numRows>=1){
            List<Integer>temp=new ArrayList<>();
            temp.add(1);
            Res.add(temp);

        }
        if(numRows>=2){
            List<Integer>temp=new ArrayList<>();
            temp.add(1);
            temp.add(1);
            Res.add(temp);

        }
        if(numRows>2){
            List<Integer>temp = new ArrayList<>();
            temp.add(1);
            Res=generate(numRows-1);
            for(int i=1;i<numRows-1;i++) {
                int a =Res.get(numRows-2).get(i-1)+Res.get(numRows-2).get(i);
                temp.add(a);
            }
            temp.add(1);
            Res.add(temp);
        }
        return Res;
    }
}