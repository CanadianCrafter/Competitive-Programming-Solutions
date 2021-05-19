import java.util.*;

import java.io.*;
public class DisjointSetTest {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int id[];
	static int sz[];
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	int M = readInt();
    	id = new int[N+1];
    	sz = new int [N+1];
    	ArrayList<Integer> edges = new ArrayList<Integer>();
    	for (int i = 0; i <= N; i++) {
			id[i] = i;
			sz[i] = 1;
		}
    	for(int i =1;i<=M;i++) {
    		int u = readInt();
    		int v = readInt();
    		if(!check(u,v)) {
    			union(u,v);
    			edges.add(i);
    		}
    	}
    	int root = root(1);
    	for(int i =1;i<=N;i++) {
    		if(root(i)!=root) {
    			System.out.println("Disconnected Graph");
    			return;
    		}
    	}
    	for(int n:edges)
    		System.out.println(n);
    	
    	
    }
    
    private static void union(int p, int q) {
    	p = root(p);
		q = root(q);
		if (sz[p] > sz[q]) {
			id[q] = p;
			sz[p] += sz[q];
		} else {
			id[p] = q;
			sz[q] += sz[p];
		}
	}
    
    private static int root(int i) {
		while (i != id[i]) {
			id[i] = id[id[i]];
			i = id[i];
		}
		return i;
	}

	private static boolean check(int p, int q) {
		if (root(p) == root(q))
			return true;
		return false;
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