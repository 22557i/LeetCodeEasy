package Tencent0906;

import java.util.Scanner;

public class DFS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int teamN = sc.nextInt();
        int result = 0;
        boolean[] vis = new boolean[n];

        int matrix[][] = new int [n][n];
        for(int l =0;l<teamN;l++){
            int size = sc.nextInt();
            int temp[] = new int[size];
            for(int i =0;i<size;++i)
                temp[i] = sc.nextInt();

            for(int i =0;i<size;++i)
                for (int j =i+1;j<size;++j)
                    matrix[i][j] = matrix[j][i] =1;
        }
        System.out.println(dfs(matrix,0,vis,result));
    }
    private static int dfs(int matrix[][], int vertex,boolean[] vis, int res){
        vis[vertex] = true;
        res++;
        for(int i = 0;i<matrix.length;++i){
            if (vis[i] == false && matrix[vertex][i] ==1 )
            dfs(matrix,i,vis,res);
        }
        return res;
    }
}
