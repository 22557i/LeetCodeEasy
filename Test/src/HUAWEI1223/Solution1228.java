package HUAWEI1223;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution1228 {
    public static int solution(int arr[]){
        int n = arr.length;

        Queue<Integer> q = new PriorityQueue<>();
        for(int num:arr)
            q.add(num);
        int res = 0;
        while(q.size()>1){
            res+=q.poll();
            res+=q.poll();
            q.add(res);
        }
        return q.peek();
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};

        System.out.println(solution(arr));
    }
}
