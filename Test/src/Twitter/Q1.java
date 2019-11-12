package Twitter;
import java.util.*;
/**
 * Created by Hao Wu on 10/29/19.
 */
public class Q1 {
    static class Token{
        private int id;

        private int etime;
        Token(int i,int m){
            this.id=i;

            this.etime = m;
        }

        public int getEtime() {
            return etime;
        }

        public void setEtime(int etime) {
            this.etime = etime;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

    }
    public static Token search(int i,List<Token>list){
        for(Token t:list){
            if(t.id==i)return t;
        }
        return null;
    }
    public static int numberOfTokens(int expirylimt,List<List<Integer>>commands){
        List<Token>list = new ArrayList<>();
        for(List<Integer> l :commands){
            if(l.get(0)==0){
                list.add(new Token(l.get(1),l.get(2)+expirylimt));
            }else {
               if( search(l.get(1),list)==null)continue;
               else if(search(l.get(1),list).getEtime()<l.get(2))list.remove(search(l.get(1),list));
               else search(l.get(1),list).setEtime(l.get(2)+expirylimt);
            }
        }
        int time = commands.get(commands.size()-1).get(2);
        int count=0;
        for(Token t:list){
            if(t.getEtime()>time)count++;
        }
        return count;
    }
}
