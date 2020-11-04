
import java.util.*;
import java.io.*;
public class DWITE09R1P5RunningInCircles {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int N;
	static int vis[];
	static int dis[];
	static boolean adj[][];
	static int ans=0;
	public static void main(String[] args) throws IOException{
		for(int k=0; k<5; k++) {
			N = readInt();
        	adj = new boolean [101][101];
        	dis = new int [101];
        	vis = new int [101];
			for(int i=0; i<N; i++) {
				adj[readInt()][readInt()] = true;
			}
			ans=0; dfs(1);
			System.out.println(ans);
		}
	}
	static void dfs(int u) {
		if(ans!=0)return;
		vis[u] = 1;
		for(int v=1; v<101; v++) {
			if(adj[u][v]) {
				if(vis[v] == 1) {
					ans = dis[u] - dis[v] + 1; 
					return; 
				}
				else if (vis[v] == 0) {
					dis[v] = dis[u] + 1;
					dfs(v);
				}
			}
		}
		vis[u] = 2;
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