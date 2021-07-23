package Google2021;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRooms {
    public int minMeetingRooms(int[][] intervals) {
        if(intervals.length==0)return 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(intervals.length,(Integer a, Integer b)->a-b);


        Arrays.sort(intervals,(int[]a, int[]b)->(a[0]-b[0]));

        pq.add(intervals[0][1]);

        for(int i =1;i<intervals.length;i++){
            if(intervals[i][0] >=pq.peek())
                pq.poll();

            pq.add(intervals[i][1]);
        }
        return pq.size();
    }


}
