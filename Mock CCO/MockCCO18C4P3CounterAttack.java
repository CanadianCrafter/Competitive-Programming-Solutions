import java.util.*;

import java.io.*;
public class MockCCO18C4P3CounterAttack {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	int M = readInt();
    	int dis1[]=new int[N+1];
    	int dis2[]=new int[N+1];
    	boolean vis[] = new boolean[N+1];
    	Arrays.fill(dis1, (int) 1e9);
    	Arrays.fill(dis2, (int) 1e9);
    	Edge edges[] = new Edge[M*2];
    	ArrayList<Node> adj[] = new ArrayList[N+1];
    	for(int i =0;i<=N;i++) adj[i]=new ArrayList<Node>();
    	for(int i =0;i<M;i++) {
    		int a = readInt();
    		int b = readInt();
    		int w = readInt();
    		edges[i]=new Edge(a,b,w);
    		edges[2*M-1-i]=new Edge(b,a,w);
    		adj[a].add(new Node(b,w));
    		adj[b].add(new Node(a,w));
    	}
    	PriorityQueue<Node> pq = new PriorityQueue();
    	PriorityQueue<Node> pq2 = new PriorityQueue();
    	pq.add(new Node(1,0));
    	dis1[1]=0;
    	while(!pq.isEmpty()) {
    		Node cur = pq.poll();
    		if(cur.w>dis1[cur.v]) continue;
    		for(Node node:adj[cur.v]) {
    			if(dis1[node.v]>dis1[cur.v]+node.w) {
    				dis1[node.v]=dis1[cur.v]+node.w;
    				pq.add(new Node(node.v,dis1[node.v]));
    			}
    		}
    	}
    	
    	pq2.add(new Node(N,0));
    	dis2[N]=0;
    	while(!pq2.isEmpty()) {
    		Node cur = pq2.poll();
    		if(cur.w>dis2[cur.v]) continue;
    		for(Node node:adj[cur.v]) {
    			if(dis2[node.v]>dis2[cur.v]+node.w) {
    				dis2[node.v]=dis2[cur.v]+node.w;
    				pq2.add(new Node(node.v,dis2[node.v]));
    			}
    		}
    	}
    	int shortest = dis1[N];
    	int ans = Integer.MAX_VALUE;
    	for(int i =0;i<edges.length;i++) {
    		
    		if(dis1[edges[i].u]+edges[i].w+dis2[edges[i].v]!=shortest)
    			ans = Math.min(ans, dis1[edges[i].u]+edges[i].w+dis2[edges[i].v]);
    	}
    	System.out.println(ans);
    	
    }
    static String next () throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static long readLong () throws IOException {
        return Long.parseLong(next());
    }
    static int readInt () throws IOException {
        return Integer.parseInt(next());
    }
    static double readDouble () throws IOException {
        return Double.parseDouble(next());
    }
    static char readCharacter () throws IOException {
        return next().charAt(0);
    }
    static String readLine () throws IOException {
        return br.readLine().trim();
    }
    static class Node implements Comparable<Node>{
    	int v;
    	int w;
    	public Node(int v, int w) {
    		this.v=v;
    		this.w=w;
    	}
		@Override
		public int compareTo(Node x) {
			return Integer.compare(w, x.w);
		}
    	
    	
    }
    static class Edge implements Comparable<Node>{
    	int u;
    	int v;
    	int w;
    	public Edge (int u, int v, int w) {
    		this.u=u;
    		this.v=v;
    		this.w=w;
    	}
		@Override
		public int compareTo(Node x) {
			return Integer.compare(w, x.w);
		}
    	
    	
    }
}