package HUAWEI1223;

import java.util.Arrays;


public class Solution1229 {
    public static int v;

    public static int solution(int[][]times,int n, int k){
    v = n;
        int g[][] = new int[n][n];
        for(int []e:g) Arrays.fill(e,-1);
        for(int []e:times)g[e[0]-1][e[1]-1] = e[2];

        return helper(g,k-1);
    }

    public static int findBestV(int distance[],int vis[]){
        int vertex = 0;
        int min = Integer.MAX_VALUE;

        for(int k = 0;k<v;k++){
            if(distance[k]<min&&vis[k] == 0){
                min = distance[k];
                vertex = k;
            }
        }

        return vertex;
    }
    public static int helper(int g[][], int source){

        int distance[] = new int[v];
        int vis[] = new int[v];

        for(int i =0;i<v;i++){
            distance[i] = Integer.MAX_VALUE;
            vis[i] =0;
        }
        for (int i = 0; i <v-1 ; i++) {
            distance[source]=0;
            int bv = findBestV(distance,vis);
            vis[bv] = 1;

            for(int j=0;j<v;j++){
                if(vis[j]==0&& g[bv][j]!=-1)
                    if(distance[j]>distance[bv]+g[bv][j])distance[j] = distance[bv]+g[bv][j];
            }
        }

        int max = 0;
        for (int i = 0; i <v ; i++) {
            if(distance[i]!=Integer.MAX_VALUE)max = Math.max(max,distance[i]);
            else return -1;
        }
        return max;
    }

    public static void main(String[] args) {
        int[][]times = {{2,1,1},{2,3,1},{3,4,1}};
        int n = 4;
        int k =2;
        System.out.println(solution(times,n,k));
    }
}
