import java.util.*;
import java.io.*;
public class CCC18J5ChooseYourOwnPath {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	List<Integer> adj[] = new ArrayList[N+1];
    	for(int i=1;i<=N;i++)adj[i]=new ArrayList();
    	ArrayList<Integer> endpoints = new ArrayList<Integer>();
    	for(int i =1;i<=N;i++) {
    		int M = readInt();
    		if(M==0)endpoints.add(i);
    		for(int j =0;j<M;j++) {
    			adj[i].add(readInt());
    			
    		}
    	}
    	
    	int dis[] = new int [N+1];
    	Queue<Integer> que = new LinkedList();
    	boolean vis[] = new boolean[N+1];
    	que.add(1);
    	vis[1]=true;
    	dis[1]=1;
    	
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
		boolean flag=true;
		for(int i =1;i<vis.length;i++) {
			if(!vis[i]) flag = false;
		}
		System.out.println(flag ? "Y":"N");
		
		int ans = Integer.MAX_VALUE;
		for(int i =0;i<endpoints.size();i++) {
			if(dis[endpoints.get(i)]>0)
				ans = Math.min(ans, dis[endpoints.get(i)]);
			
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