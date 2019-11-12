package HUAWEI1012;
import java.util.*;
/**
 * Created by Hao Wu on 10/12/19.
 */
public class Q2 implements Comparable<Q2>{
    private String name;
    private int num;
    private int load;

    public Q2(String name, int num, int load) {
        this.name = name;
        this.num = num;
        this.load = load;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf( sc.nextLine());
        ArrayList<String>list = new ArrayList<>();
        while (sc.hasNext()){
            list.add(sc.nextLine());
        }
        List<String> namelist = new ArrayList<>();
        for (String s:list){
            String temp[] = s.split(" ");
            if(!namelist.contains(temp[0]))namelist.add(temp[0]);
        }
        int size = namelist.size();
        List<List<Q2>>result = new ArrayList<>();
        int i=0;
        while (i<size){

            for(String name:namelist) {
                List<Q2>templist = new ArrayList<>();
                for (String s : list) {
                    String temp[] = s.split(" ");
                    if (temp[0].equals(name)) {
                        templist.add(new Q2(temp[0],
                                Integer.valueOf(temp[1]), Integer.valueOf(temp[2])));
                    }
                }
                result.add(templist);
            }
            i++;
        }
        for (List l:result){
            Collections.sort(l);
            for (Object m:l){
                Q2 t = (Q2) m;
                System.out.println(t);
            }
        }


    }

    @Override
    public int compareTo(Q2 o) {
        if(this.load!=o.load)return this.load-o.load;
        else return this.num-o.num;
    }
    public String toString(){
        return this.name+" "+this.num+" "+this.load;
    }
}
