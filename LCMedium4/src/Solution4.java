/**
 * Created by Hao Wu on 12/8/19.
 */
public class Solution4 {
    public int myAtoi(String str) {
        str = str.trim();

        long value =0;
        int sign = 1;

        char []set = str.toCharArray();

        for (int i = 0; i <set.length ; i++) {
            if(i==0&&(set[i]=='+'||set[i]=='-')){
                if(set[i]=='-')sign = -1;
                continue;
            }

            if(set[i]<'0'&&set[i]>'9')break;

            value = value*10 + (set[i]-'0');
            if(value>Integer.MAX_VALUE)
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
        }
        return (int)(sign*value);
    }
}
