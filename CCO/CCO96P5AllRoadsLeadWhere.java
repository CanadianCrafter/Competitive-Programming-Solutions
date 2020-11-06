import java.util.*;
import java.io.*;
public class CCO96P5AllRoadsLeadWhere {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static boolean adj[][];
    static int pre[];
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	int M = readInt();
    	HashMap<String, Integer> map = new HashMap<String, Integer>();
    	adj= new boolean [27][27];
    	int idx=0;
    	pre = new int [27];
    	boolean vis[] = new boolean [27];
    	String city[] = new String[27];
    	
    	for(int i =1;i<=N;i++) {
    		String u = next();
    		String v = next();
    		if(!map.containsKey(u)) {
    			map.put(u, ++idx);
    			city[idx]=u;
    		}
    		if(!map.containsKey(v)) {
    			map.put(v, ++idx);
    			city[idx]=v;
    		}
    		adj[map.get(u)][map.get(v)] =adj[map.get(v)][map.get(u)]=true;
    	}
    	for(int i =0;i<M;i++) {
    		String start=next();
    		String end = next();
    		String ans ="";
    		bfs(map.get(end));
    		for(int u = map.get(start);u!=-1;u=pre[u]) {
    			ans+=city[u].charAt(0);
    		}
    		System.out.println(ans);
    	}
    	
    }
    private static void bfs(Integer start) {
    	Queue<Integer> que = new LinkedList();
    	boolean vis[] = new boolean[27];
    	que.add(start);
    	vis[start]=true;
    	pre[start]=-1;
    	while(!que.isEmpty()) {
    		int u = que.poll();
    		for(int v =1;v<=26;v++) {
    			if(!vis[v]&&adj[u][v]) {
    				que.add(v);
    				vis[v]=true;
    				pre[v]=u;
    			}
    		}
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