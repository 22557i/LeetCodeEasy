package Google20200406;

import java.util.Arrays;

public class Solution {
    public int solution(String s){
        int n = s.length();
        char[] chars = s.toCharArray();
        int charset[] = new int[n];
        boolean visited[] = new boolean[128];

        for(int i= n-1;i>-1;i--){
            if (i != n-1) charset[i] = charset[i+1];
            if(!visited[chars[i]]){
                visited[chars[i]]=true;
                charset[i]++;
            }
        }
        Arrays.fill(visited,false);
        int res = 0, left = 0;
        for (int i = 0; i < n-1; ++i) {
            if (!visited[chars[i]]) {
                visited[chars[i]] = true;
                ++left;
            }
            if(left==charset[i+1])res++;
        }
        return res;
    }
    //public
}
