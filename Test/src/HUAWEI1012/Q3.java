package HUAWEI1012;

import java.util.*;

/**
 * Created by Hao Wu on 10/12/19.
 */
public class Q3 {
    public static boolean[][] visited;
    public static boolean[] result = new boolean[8];
    public static int direction[][] ={{1,0},{1,1},{0,1},{-1,1},{-1,0},{-1,-1},{0,-1},{1,-1}};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String[] info = inputString.split(",");
        int n = info.length;
        visited = new boolean[n][8];
        int[][]grid = new int[8][8];
        grid[3][3]=grid[4][4] =-1;
        grid[3][4]=grid[4][3]=1;

        int[][]moves = new int[n][2];
        for (int i = 0; i <n ; i++) {
            moves[i][0]=(int)info[i].charAt(0)-'A';
            moves[i][1] = (int)info[i].charAt(0)-'0';
        }
        boolean movecheck[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 8; j++) {
                if(help(grid,moves[i][0],moves[i][1],i%2==0?1:-1,j)) {
                    visited[i][j] = true;
                    break;
                }
            }
        }
        for (int i=0;i<n;i++){
            for (int j = 0; j <8 ; j++) {
                if(visited[i][j]){
                    result[i]=true;
                    break;
                }
            }
        }
        int truecount=0;
        for (int i=0;i<visited.length;i++){
            if(result[i])truecount++;
            else {System.out.println("ERROR "+i+":"+(char)(moves[i][0]+'A')+""+moves[i][1]);
            return;}
        }
        if(truecount==n){
            int black=0;
            int white =0;
            for (int i = 0; i <8 ; i++) {
                for (int j = 0; j < 8; j++) {
                    if(grid[i][j]==1)black++;
                    if(grid[i][j]==-1)white++;
                }
            }
            System.out.println("OK "+black+":"+white);
            return;
        }

    }
    public static boolean help(int [][]grid,int i,int j,int pivot,int n){
        while (i<8&&j<8&&i>0&&j>0){
            i+=direction[n][0];
            j+=direction[n][1];
            if(!(i<8&&j<8&&i>0&&j>0))break;
            if(grid[i][j]==-pivot){
                while(i<8&&j<8&&i>0&&j>0){
                    i+=direction[n][0];
                    j+=direction[n][1];
                    if(!(i<8&&j<8&&i>0&&j>0))break;
                    if(grid[i][j]==-pivot)return true;
                }
            }

        }
        return false;
    }
}
