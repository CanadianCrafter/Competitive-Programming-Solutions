import java.util.*;
import java.io.*;

public class WC18C4S1WorldOfStarCraft {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int id[];
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	int M = readInt();
    	int K = readInt();
    	id = new int[N+1];
    	for(int i =0;i<N+1;i++)id[i]=i;
    	char race[] = readLine().toCharArray();
    	for(int i =0;i<M;i++) {
    		int u = readInt();
    		int v = readInt();
    		if(race[u-1]==race[v-1]) {
    			id[root(u)]=root(v);
    		}
    	}
    	int ans =0;
    	for(int i =1;i<=K;i++) {
    		int u = readInt();
    		int v = readInt();
    		if(root(u)==root(v))
    			ans++;
    	}
    	System.out.println(ans);
    }
    
    private static int root(int i) {
    	while (i != id[i]) {
    		id[i] = id[id[i]];
			i = id[i];
		}
		return i;
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