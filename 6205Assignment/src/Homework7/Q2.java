package Homework7;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Hao Wu on 10/22/19.
 */
public class Q2 {
    int grid[][] =new int[7][7];
    boolean visited[] = new boolean[7];

    public void init(){
        int l[] = {5,4,3,6,5,1,2,2,4};
        int r[] = {6,6,7,7,7,4,4,3,7};
        for (int i = 0; i <9 ; i++) {
            grid[l[i]-1][r[i]-1]=1;
            grid[r[i]-1][l[i]-1]=1;
        }
    }
    public Q2(){
        init();
    }
    public void dfs(int[][]n ,int start ){
        if(start>=n.length)return;
        System.out.println("The node "+(start+1)+" has been tranversed.");
        visited[start] =true;
            for (int j = 0; j <n.length ; j++) {
                if(n[start][j]==1&&!visited[j])
                    dfs(n,j);
            }
    }
    public void bfs(int[][]n,int start){
        if(start>=n.length)return;
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        while (!q.isEmpty()){
            int temp = q.poll();
            if(!visited[temp]){
                visited[temp] = true;
                System.out.println("The node "+(temp+1)+" has been tranversed.");
                for (int i = 0; i < n.length; i++) {
                    if(!visited[i]&&n[temp][i]==1)
                        q.offer(i);
                }
            }
        }

    }
    public static void main(String[] args) {
        System.out.println("-----------DFS-----------");
        Q2 q = new Q2();
        q.dfs(q.grid,0);
        System.out.println("-----------BFS-----------");
        Q2 q1 = new Q2();
        q1.bfs(q1.grid,0);
    }
}
