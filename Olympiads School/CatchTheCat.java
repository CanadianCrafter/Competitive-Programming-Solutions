import java.util.*;
import java.io.*;
public class CatchTheCat {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int x = readInt();
    	int y = readInt();
    	if(x==y) {
    		System.out.println(0);
    		return;
    	}
    	boolean vis[] = new boolean [(int)2e5+1];
    	int dis[] = new int [(int)2e5+1];
    	Queue<Integer> que = new LinkedList();
    	que.add(x);
    	dis[x]=0;
    	vis[x]=true;
    	while(!que.isEmpty()) {
    		int u = que.poll();
    		int v=0;
    		for(int i =0;i<3;i++) {
    			if(i==0) v=u-1;
    			else if(i==1)v=u+1;
    			else v=2*u;
    			if(v>=0&&v<vis.length&&!vis[v]) {
    				que.add(v);
    				vis[v]=true;
    				dis[v]=dis[u]+1;
    				if(v==y) {
    					System.out.println(dis[y]);
    					return;
    				}
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