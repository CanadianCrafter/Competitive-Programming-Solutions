import java.util.*;
import java.io.*;
public class DirectedAcyclicGraph {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int N;
    static int vis[];
    static boolean adj[][];
    static boolean cycle = false;
    public static void main(String[] args) throws IOException {
    	N = readInt();
    	adj = new boolean [N][N];
    	vis = new int [N];
    	for(int i =0;i<N;i++) {
    		for(int j=0;j<N;j++) {
    			adj[i][j]=(readInt()==1?true:false);
    		}
    	}
    	for(int i =0;i<N;i++) {
    		if(vis[i]==0)dfs(i);
    	}
    	System.out.println(cycle?"NO":"YES");
    }
    private static void dfs(int u) {
		vis[u]=1;
		for(int v = 0;v<N;v++) {
			if(adj[u][v]) {
				if(vis[v]==1) {
					cycle = true;
					return;
				}
				else if(vis[v]==0) {
					dfs(v);
				}
			}
		}
		vis[u]=2;
		
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