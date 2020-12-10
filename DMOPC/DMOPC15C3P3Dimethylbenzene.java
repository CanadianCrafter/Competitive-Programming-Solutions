import java.util.*;
import java.io.*;
public class DMOPC15C3P3Dimethylbenzene {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int N, M;
    static boolean adj[][], vis[][];
    static boolean cycle=false;
    public static void main(String[] args) throws IOException {
    	N = readInt();
    	M = readInt();
    	adj=new boolean[N+1][N+1];
    	vis=new boolean[N+1][N+1];
    	for(int i =0;i<M;i++) {
    		int u = readInt();
    		int v = readInt();
    		adj[u][v]=adj[v][u]=true;
    	}
    	//Do multiple DFS in case there is a forest
    	for(int i =1;i<=N;i++) {
    		if(!vis[i][i]) 
    			dfs(i,i,1);
    		if(cycle) {
    			System.out.println("YES");
    			return;
    		}
    	}
    	System.out.println("NO");
    }
    private static void dfs(int cur, int start, int len) {
    	vis[start][cur]=true;
    	
    	for(int nxt =1;nxt<=N;nxt++) {
    		if(!adj[cur][nxt])
    			continue;
    		if(nxt==start&&len==6) {
    			cycle = true;
    			return;
    		}
    		if(!vis[start][nxt])
    			dfs(nxt,start,len+1);
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