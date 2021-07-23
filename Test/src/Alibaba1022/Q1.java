package Alibaba1022;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testGroup = sc.nextInt();
        int []map = new int[1001];
        while(testGroup>0){
            int n = sc.nextInt();
            ArrayList<Integer>l = new ArrayList<>();
            int nums[] = new int[n];
            for(int i =0;i<n;i++){
                int temp = sc.nextInt();
                if(!l.contains(temp))l.add(temp);
                map[temp]++;
            }
            l.sort((n1,n2)->map[n2]-map[n1]);
            int size =n;
            while(size>0){
                int i=0,j =0;
                if(map[l.get(i)]>0){
                    nums[j] = l.get(i);
                    map[l.get(i)]--;
                    j++;
                    i = (i+1)%l.size();
                    size--;
                }
            }
            int total = 0;
            

            testGroup--;
        }
    }
}
