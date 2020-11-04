import java.util.*;
import java.io.*;
public class CCC13S4WhoIsTaller {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	int M = readInt();
    	List<Integer> adj[] = new ArrayList[N+1];
    	for(int i=1;i<=N;i++)adj[i]=new ArrayList();
    	for(int i =0;i<M;i++) {
    		adj[readInt()].add(readInt());
    	}
    	int p = readInt();
    	int q = readInt();
    	
    	Queue<Integer> que = new LinkedList();
    	boolean vis[] = new boolean[N+1];
    	que.add(p);
    	vis[p]=true;
		while(!que.isEmpty()) {
			int u = que.poll();
			for(int v : adj[u]) {
				if(!vis[v]) {
					que.add(v);
					vis[v]=true;
				}
			}
		}
		if(vis[q]) System.out.println("yes");
		else {
			Arrays.fill(vis, false);
			que.add(q);
	    	vis[q]=true;
			while(!que.isEmpty()) {
				int u = que.poll();
				for(int v : adj[u]) {
					if(!vis[v]) {
						que.add(v);
						vis[v]=true;
					}
				}
			}
			System.out.println(vis[p]? "no":"unknown");
			
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