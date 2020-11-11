import java.util.*;
import java.io.*;
public class DMOPC14C5P6SaveNagato {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int N;
    static int last;
    static List<Integer> adj[];
    public static void main(String[] args) throws IOException {
    	N = readInt();
    	adj = new ArrayList[N+1];
    	for(int i =1;i<=N;i++) adj[i] = new ArrayList();
    	for(int i =1;i<N;i++) {
    		int u = readInt();
    		int v = readInt();
    		adj[u].add(v);
    		adj[v].add(u);
    	}
    	int dis1[] = new int [N+1];
    	int dis2[] = new int[N+1];
    	bfs(1,dis1); //start from any node and find the farthest node
    	bfs(last,dis1); //start from the fartest node and find the distance from one diameter endpoint	
    	bfs(last,dis2); // start from the other farthest node and find the distance from the other endpoint
    	for(int i =1;i<=N;i++) {
    		System.out.println(Math.max(dis1[i], dis2[i]));
    	}
    }
    private static void bfs(int start, int[] dis) {
    	int que[] = new int[N+1]; //faster version of queue using array
    	int f=0,r=0; //front and rear of the queue
    	boolean vis[] = new boolean[N+1];
    	que[r++]=start;
    	vis[start]=true;
    	dis[start]=1;
		while(f<r) {
			int u =que[f++];
			last = u;
			for(int v : adj[u]) {
				if(!vis[v]) {
					que[r++]=v;
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