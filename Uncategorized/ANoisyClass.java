import java.util.*;
import java.io.*;
public class ANoisyClass {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	int M= readInt();
    	int in[] = new int[N+1];
    	ArrayList<Integer> adj[] = new ArrayList[N+1];
    	for(int i =0;i<N+1;i++)
    		adj[i]=new ArrayList<Integer>();
    	for(int i =0;i<M;i++) {
    		int u = readInt();
    		int v = readInt();
    		adj[u].add(v);
    		in[v]++;
    	}
    	Queue<Integer> que = new LinkedList();
    	for(int i =1;i<=N;i++)
    		if(in[i]==0)que.add(i);
    	int cnt=0;
    	while(!que.isEmpty()) {
    		int u = que.poll();
    		cnt++;
    		for(int v : adj[u]) {
    			in[v]--;
    			if(in[v]==0)
    				que.add(v);
    		}
    	}
    	System.out.println(cnt==N?"Y":"N");
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