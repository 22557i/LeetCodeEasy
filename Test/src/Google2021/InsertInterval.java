package Google2021;

import java.util.ArrayList;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int newStart = newInterval[0];
        int newEnd = newInterval[1];

        int index = 0;
        int n = intervals.length;

        ArrayList<int[]>output = new ArrayList<>();

        while(index<n &&intervals[index][1]<newStart){
            output.add(intervals[index++]);
        }

        int interval[] = new int[2];
        while(index<n && intervals[index][0]<=newEnd){
            newStart = Math.min(newStart,intervals[index][0]);
            newEnd = Math.max(newEnd, intervals[index][1]);
            index++;
        }
        output.add(new int[]{newStart, newEnd});

        while(index<n){
            output.add(intervals[index++]);
        }

        return output.toArray(new int[0][0]);
    }
}
