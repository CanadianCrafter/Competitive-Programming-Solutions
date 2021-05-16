import java.util.*;
import java.io.*;
public class CountingCycles {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static boolean adj[][],vis[]; 
    static int N;
    static int ans=0;
    public static void main(String[] args) throws IOException {
    	N = readInt();
    	adj= new boolean[N][N];
    	vis=new boolean[N];
    	for(int i =0;i<N;i++) {
    		for(int j =0;j<N;j++) {
    			adj[i][j]=readInt()==0?false:true; //can also write readInt() ==1 to be fancy
    		}
    	}
    	
    	for(int i =0;i<N;i++) {
    		dfs(i,i);
    	}
    	System.out.println(ans);
    	
    	
    }
    private static void dfs(int start, int cur) {
		vis[cur]=true;
		for(int v=0;v<N;v++) {
			if(!adj[cur][v]) continue;
			if(v==start) ans++;
			else if(!vis[v]&&v>start) dfs(start,v); //do v>start to make sure there is no duplicate cycles
													//This is because only one cycle where you start with the lowest value
		}
		vis[cur]=false; //set the vis to false since another cycle can use the same node
		
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