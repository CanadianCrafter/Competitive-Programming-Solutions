import java.util.*;
import java.io.*;
public class TSOC15C1P5GiantAnts {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	int M = readInt();
    	List<Integer> adj[] = new ArrayList[N+1];
    	for(int i=1;i<=N;i++)adj[i]=new ArrayList();
    	for(int i=0;i<M;i++) {
    		int x = readInt();
    		int y = readInt();
    		adj[x].add(y);
    		adj[y].add(x);
    	}
    	
    	int W = readInt();
    	Queue<Integer> que = new LinkedList();
    	boolean vis[]=new boolean[N+1];
    	int dis[] = new int [N+1];
    	for(int i =1;i<=W;i++) {
    		int x = readInt(); que.add(x); vis[x]=true; dis[x]=0;
    	}
    	while(!que.isEmpty()) {
    		int u = que.poll();
    		for(int v : adj[u]) {
    			if(!vis[v]) {
    				que.add(v);
    				vis[v]=true;
    				dis[v]=dis[u]+4;
    			}
    		}
    	}
    	
    	int dis2[] = new int[N+1];
    	Arrays.fill(vis, false);
    	
    	que.add(1);
    	vis[1]=true;
    	dis2[1]=0;
    	while(!que.isEmpty()) {
    		int u = que.poll();
    		for(int v:adj[u]) {
    			if(!vis[v]&&dis2[u]+1<dis[v]) {
    				que.add(v);
    				vis[v]=true;
    				dis2[v]=dis2[u]+1;
    			}
    		}
    	}
    	if(vis[N])System.out.println(dis2[N]);
    	else System.out.println("sacrifice bobhob314");
    	
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