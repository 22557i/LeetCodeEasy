package Huawei;


import java.util.ArrayList;
import java.util.HashSet;

public class Solution3 {
	int vertices;
	ArrayList<Integer> edge[];
	Solution3(int vertices){
		this.vertices = vertices;
		edge = new ArrayList[vertices+1];
		for (int i = 0; i <vertices+1 ; i++) {
			edge[i] = new ArrayList<>();
		}

	}
	void addedge(int a, int b){
		edge[a].add(b);
	}
	void dfs(int node,ArrayList<Integer> adj[], int dp[],boolean visited[]){
		visited[node] = true;
		for (int i = 0; i <adj[node].size() ; i++) {
			if(!visited[adj[node].get(i)])
				dfs(adj[node].get(i),adj,dp,visited);
		dp[node] = Math.max(dp[node],1+dp[adj[node].get(i)]);

		}
	}

	int findlongpath(int n ){
		ArrayList<Integer> adj[] = edge;
		int [] dp = new int[n+1];
		boolean visited[] = new boolean[n+1];
		for (int i = 1; i <n+1 ; i++) {
			if(!visited[i])dfs(i,adj,dp,visited);

		}
		int res =0;
		for(int i =1;i<n+1;i++){
			res = Math.max(res,dp[i]);
		}
		return  res;
	}

	public void function(){
		int M=6 ;
		int N;

	}
}
