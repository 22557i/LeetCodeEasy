/**
 * Created by Hao Wu on 11/29/19.
 */
public class Solution731 {

}
class MyCalendarTwo {
    private boolean[] map;
    public MyCalendarTwo() {
        this.map = new boolean[100000001];
    }

    public boolean book(int start, int end) {
        for (int i = start;i<end;++i){
            if(map[i]==true)return false;
        }
        for(int i = start;i<end;++i) {
            map[i] = true;
        }
        return true;
    }
}