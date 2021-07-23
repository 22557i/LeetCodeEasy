package Google2021;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num:nums)set.add(num);

        int res = 0;

        for(int num:set){
            if(!set.contains(num-1)){
                int cur = num;
                int curStreak = 1;

                while(set.contains(cur+1)){
                    cur++;
                    curStreak++;
                }
                res = Math.max(res,curStreak);
            }
        }
        return res;
    }
}
