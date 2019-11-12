package Homework8;

import java.util.Arrays;

/**
 * Created by Hao Wu on 11/4/19.
 */
public class Q3 {

    static class Graph {
        Edge[] edges;
        int[][] arr;
    }

    static class Edge implements Comparable<Edge> {
        int begin;
        int end;
        int weight;

        @Override
        public int compareTo(Edge o) {
            return this.weight - o.weight;
        }

    }

    public static void kruskal(Graph graph) {
        Edge[] edges = graph.edges;
        int[][] arr = graph.arr;
        int[] parent = new int[7];
        for (int i = 0; i < 7; i++) {
            parent[i] = 0;
        }
        for (int i = 0; i < edges.length; i++) {
            Edge edge = edges[i];
            int rootOfBegin = findParentRoot(edge.begin, parent);
            int rootOfend = findParentRoot(edge.end, parent);
            if (rootOfBegin != rootOfend) {
                System.out.println( "("+(char)(rootOfBegin+'a')+","+(char)(rootOfend+'a')+")->"+ edge.weight);
                parent[rootOfBegin] = rootOfend;
            }
        }
    }


    private static int findParentRoot(int target, int[] parent) {
        while (parent[target] > 0) {
            target = parent[target];
        }
        return target;
    }

    public static void main(String[] args) {
        //set up
        Graph graph = new Graph();
        int[][] arr = new int[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == j)
                    arr[i][j] = 0;
                else {
                    arr[j][i] = Integer.MAX_VALUE;
                }
            }
        }
        arr[0][1] = 5;
        arr[0][2] = 3;
        arr[1][2] = 4;
        arr[1][3] = 6;
        arr[1][4] = 2;
        arr[2][3] = 5;
        arr[3][4] = 7;
        arr[2][5] = 11;
        arr[3][5] = 9;
        arr[4][5] = 12;
        arr[4][6] = 8;
        arr[5][6] = 7;
        for (int i = 0; i < 7; i++) {
            for (int j = i; j < 7; j++) {
                arr[j][i] = arr[i][j];
            }
        }
        graph.arr = arr;
        int k = 0;
        Edge[] edges = new Edge[12];
        for (int i = 0; i < edges.length; i++) {
            Edge edge = new Edge();
            edges[i] = edge;
        }
        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 7; j++) {
                if (arr[i][j] < Integer.MAX_VALUE) {
                    edges[k].begin = i;
                    edges[k].end = j;
                    edges[k].weight = arr[i][j];
                    k++;
                }
            }
        }
        graph.edges = edges;
        Arrays.sort(edges);
        kruskal(graph);
    }
}
