/**
 * Created by Hao Wu on 11/25/19.
 */
public class Solution1189 {
    int map[] = new int[6];
    public int maxNumberOfBalloons(String text) {
        int res = 0;
        for (char c: text.toCharArray()){
            switch (c){
                case 'a':
                    map[0]++;
                    break;
                case 'b':
                    map[1]++;
                    break;
                case 'l':
                    map[2]++;
                    break;
                case 'o':
                    map[3]++;
                    break;
                case 'n':
                    map[4]++;
                    break;
                case 's':
                    map[5]++;
                    break;
        }
        if(map[0]>=1&&map[1]>=1&&map[2]>=2&&map[3]>=2&&map[4]>=1&&map[5]>=1){
            res ++;
            map[0]--;
            map[1]--;
            map[2]-=2;
            map[3]-=2;
            map[4]--;
            map[5]--;
            for(int n:map) System.out.print(n+" ");
            }
            for(int n:map) System.out.print(n+" ");
            System.out.println();

        }
         return res;
    }

    public static void main(String[] args) {
        String s =
                "nlaebolko";

        Solution1189 solution1189 = new Solution1189();

        solution1189.maxNumberOfBalloons(s);

    }
}
