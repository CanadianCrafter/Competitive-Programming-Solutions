import java.util.*;
import java.io.*;
public class WC18C3S2GymTour {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int N,K,F;
    static int max = 100002;
    static boolean gym[] = new boolean[max];
    static boolean vis[] = new boolean[max];
    static ArrayList<Integer> adj[];
    static int distFromStart[] = new int [max];
    static int cnt[] = new int [max];
    static int farthestDist = 0;
    
    public static void main(String[] args) throws IOException {
    	N = readInt();
    	K = readInt();
    	F = readInt();
    	adj = new ArrayList[N+1];
    	for(int i =0;i<N+1;i++) adj[i] = new ArrayList<Integer>();
    	for(int i =0;i<K;i++) {
    		gym[readInt()]=true;
    	}
    	for(int i =1;i<N;i++) {
    		int a = readInt();
    		int b = readInt();
    		adj[a].add(b);
    		adj[b].add(a);
    	}
    	
    	dfs(1,0);
    	int caseOne = 2*cnt[1]-farthestDist; //visit every gym and don't return
    	gym[F]=true;
    	dfs(1,0);
    	int caseTwo = cnt[1]; //no repeated work; just sum of edge's weight=num edges 
    	System.out.println(Math.min(caseOne, caseTwo));
    	
    	
    }
    private static void dfs(int u, int p) {
		cnt[u]=0;
		for(int v: adj[u]) {
			if(v==p)continue;
			distFromStart[v]=distFromStart[u]+1;
			dfs(v,u);
			if(gym[v]) {
				cnt[u]+=cnt[v]+1;
				gym[u]=true;
			}
		}
    	
    	if(gym[u])
    		farthestDist= Math.max(farthestDist, distFromStart[u]);
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