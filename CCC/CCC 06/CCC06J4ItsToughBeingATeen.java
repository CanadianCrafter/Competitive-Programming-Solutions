import java.util.*;
import java.io.*;
public class CCC06J4ItsToughBeingATeen {
	//topological sort
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = 7;
    	int inDegree[] = new int [N+1];
    	ArrayList<Integer> adj[]  =new ArrayList[8];
    	for(int i =1;i<=N;i++)
    		adj[i]=new ArrayList<Integer>();
    	//pre set values
    	adj[1].add(7);
    	adj[1].add(4);
    	adj[2].add(1);
    	adj[3].add(4);
    	adj[3].add(5);
    	inDegree[1]=1;
    	inDegree[4]=2;
    	inDegree[5]=1;
    	inDegree[7]=1;
    	
    	while(true) {
    		int x = readInt();
    		int y = readInt();
    		if(x==0&&y==0)break;
    		adj[x].add(y);
    		inDegree[y]++;
    	}
    	PriorityQueue<Integer> que = new PriorityQueue(); //lower values are dequeued first
    	ArrayList<Integer> ans = new ArrayList<Integer>();
    	
    	for(int i =1;i<=N;i++)
    		if(inDegree[i]==0) que.add(i);
    	
    	while(!que.isEmpty()) {
    		int u = que.poll();
    		ans.add(u);
    		for(int v:adj[u]) {
    			inDegree[v]--;
    			if(inDegree[v]==0)que.add(v);
    		}
    	}
    	if(ans.size()!=N)
    		System.out.println("Cannot complete these tasks. Going to bed.");
    	else {
    		for(int x : ans) {
    			System.out.print(x+" ");
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