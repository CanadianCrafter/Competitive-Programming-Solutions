import java.util.*;
import java.io.*;
public class DWITE07R2P5BridgesInAGraph {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int N,M;
    static boolean adj[][];
    static boolean vis[]; 
    static Edge edges[]; 
    public static void main(String[] args) throws IOException {
    	for(int n = 0;n<5;n++) {
    		N = readInt();
        	M = readInt();
        	adj = new boolean [102][102];
        	vis= new boolean[102];
        	edges = new Edge[1002];
        	for(int i =0;i<M;i++) {
        		int u = readInt();
        		int v = readInt();
        		edges[i]=new Edge(u,v);
        		adj[u][v]=adj[v][u]=true;
        	}
        	int numBridge=0;
        	for(int i=0;i<M;i++) {
        		adj[edges[i].u][edges[i].v]=adj[edges[i].v][edges[i].u]=false;
        		int numVis = bfs(1);
        		if(numVis !=N)numBridge++;
        		adj[edges[i].u][edges[i].v]=adj[edges[i].v][edges[i].u]=true;
        	}
        	System.out.println(numBridge);
        	
    	}
    	
    }
    
    public static int bfs(int start){
    	Arrays.fill(vis, false);
    	Queue<Integer> que = new LinkedList();
    	que.add(start);
    	vis[start]=true;
    	int k = 1;
    	while(!que.isEmpty()) {
    		int u = que.poll();
    		for(int v=1;v<=N;v++) {
    			if(!vis[v]&&adj[u][v]) {
    				que.add(v);
    				vis[v]=true;
    				k++;
    			}
    		}
    	}
    	return k;
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
}
class Edge{
	int u;
	int v;
	
	public Edge(int u, int v) {
		this.u=u;
		this.v=v;
	}
}