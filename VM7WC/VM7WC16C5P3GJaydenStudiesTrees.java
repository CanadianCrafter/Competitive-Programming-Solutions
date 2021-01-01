import java.util.*;
import java.io.*;
public class VM7WC16C5P3GJaydenStudiesTrees {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int N, root, len;
    static List<Integer> adj[];
    public static void main(String[] args) throws IOException {
    	N = readInt();
    	adj = new ArrayList[N+1];
    	for(int i=1;i<=N;i++)adj[i]=new ArrayList();
    	for(int i =1;i<N;i++) {
    		int u = readInt();
    		int v = readInt();
    		adj[u].add(v);
    		adj[v].add(u);
    	}
    	bfs(1);
    	bfs(root);
    	System.out.println(len);
    }
    
    private static void bfs(int start) {
    	len=0;
    	Queue<Integer> que = new LinkedList();
    	int dis[] = new int [N+1];
    	boolean vis[] = new boolean[N+1];
    	que.add(start);
    	vis[start]=true;
    	dis[start]=0;
		while(!que.isEmpty()) {
			int u = que.poll();
			if(dis[u]>len) {
				len=dis[u];
				root = u;
			}
			for(int v : adj[u]) {
				if(!vis[v]) {
					que.add(v);
					vis[v]=true;
					dis[v]=dis[u]+1;
				}
			}
		}
		
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