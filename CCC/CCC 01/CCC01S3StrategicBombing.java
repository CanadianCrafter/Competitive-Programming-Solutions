import java.util.*;
import java.io.*;
public class CCC01S3StrategicBombing {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static ArrayList<Integer> adj[]= new ArrayList[27];
    static boolean vis[];
    static int numEdges =0;
    static int numNodes;
    static ArrayList<String> edges; 
    public static void main(String[] args) throws IOException {
        	for(int i =0;i<27;i++)adj[i] = new ArrayList<Integer>();
        	edges =  new ArrayList<String>();
        	
        	while(true) {
        		String str = next();
        		if(str.equals("**")) break;
        		edges.add(str);
        		int u = str.charAt(0)-'A';
        		int v = str.charAt(1)-'A';
        		adj[u].add(v);
        		adj[v].add(u);
        		
        	}
        	int numBridge=0;
        	for(int i=0;i<edges.size();i++) {
        		
        		if(bfs(edges.get(i))) {
        			System.out.println(edges.get(i));
        			numBridge++;
        		}
        	}
        	System.out.printf("There are %d disconnecting roads.\n",numBridge);
    	}
    	
    
    public static boolean bfs(String str){
    	int a = str.charAt(0)-'A';
		int b = str.charAt(1)-'A';
    	vis = new boolean[27];
    	Arrays.fill(vis, false);
    	Queue<Integer> que = new LinkedList();
    	que.add(0);
    	while(!que.isEmpty()) {
    		int u = que.poll();
    		if(!vis[u]&&u!=-1) {
    			vis[u]=true;
    			for(int v=0;v<adj[u].size();v++) {
    				if(!(u==a&&adj[u].get(v)==b||u==b&&adj[u].get(v)==a))
    					que.add(adj[u].get(v));
    			}
    		}
    	}
    	return !vis[1];
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
class Edge1{
	int u;
	int v;
	
	public Edge1(int u, int v) {
		this.u=u;
		this.v=v;
	}
}