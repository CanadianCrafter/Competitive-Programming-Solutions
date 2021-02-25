import java.util.*;
import java.io.*;
public class TLE17C3P3FaxsThanksgivingDish {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int N, M;
    static ArrayList<Integer>adj[];
    static int cnt[];
    static boolean vis[];
    public static void main(String[] args) throws IOException {
    	N = readInt();
    	M = readInt();
    	adj=new ArrayList[N+1];
    	cnt= new int[N+1];
    	vis=new boolean[N+1];
    	for(int i =0;i<N+1;i++)
    		adj[i]=new ArrayList<Integer>();
    	for(int i =1;i<=M;i++) {
    		int target =readInt();
    		int k = readInt();
    		for(int j =0;j<k;j++) {
    			adj[target].add(readInt());
    		}
    	}
    	for(int i =1;i<=N;i++)
    		cnt[i]=readInt();
    	System.out.println(dfs(1));
    	
    }
    private static int dfs(int u) {
		int min = Integer.MAX_VALUE;
		vis[u]=true;
		//find child node with the min value
		for(int v:adj[u]) {
			if(!vis[v])
				min = Math.min(min, dfs(v));
			else min =0; //if there is loop
		}
		if(min!=Integer.MAX_VALUE)
			return min+cnt[u];
		return cnt[u];
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