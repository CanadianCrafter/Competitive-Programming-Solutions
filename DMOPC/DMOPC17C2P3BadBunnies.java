import java.util.*;
import java.io.*;
public class DMOPC17C2P3BadBunnies {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	int R = readInt();
    	List<Integer> adj[] = new ArrayList[N+1];
    	for(int i=1;i<=N;i++)adj[i]=new ArrayList();
    	for(int i=1;i<N;i++) {
    		int u = readInt();
    		int v = readInt();
    		adj[u].add(v);
    		adj[v].add(u);
    	}
    	
    	//bfs for rabbits
    	Queue<Integer> que = new LinkedList();
    	boolean vis[]=new boolean[N+1];
    	int dis[] = new int [N+1];
    	for(int i =1;i<=R;i++) {
    		int x = readInt(); que.add(x); vis[x]=true; dis[x]=0;
    	}
    	while(!que.isEmpty()) {
    		int u = que.poll();
    		for(int v : adj[u]) {
    			if(!vis[v]) {
    				que.add(v);
    				vis[v]=true;
    				dis[v]=dis[u]+1;
    			}
    		}
    	}
    	
    	int start  =readInt();
    	int end = readInt();
    	int prev[] = new int[N+1];
    	Arrays.fill(vis, false);
    	
    	que.add(start);
    	vis[start]=true;
    	prev[start]=-1;
    	while(!que.isEmpty()) {
    		int u = que.poll();
    		for(int v:adj[u]) {
    			if(!vis[v]) {
    				que.add(v);
    				vis[v]=true;
    				prev[v]=u;
    			}
    		}
    	}
    	int ans = Integer.MAX_VALUE;
    	for(int u = end;u!=-1;u=prev[u]) {
    		ans = Math.min(ans, dis[u]);
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
}