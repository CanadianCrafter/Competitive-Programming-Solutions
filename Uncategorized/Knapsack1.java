import java.util.*;
import java.io.*;
public class Knapsack1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	int W = readInt();
    	int wt[] = new int[N+1];
    	int val[] = new int[N+1];
    	long dp[][]= new long[2][W+1];
    	
    	
    	for(int i =1;i<=N;i++) {
    		wt[i]=readInt();
    		val[i]=readInt();
    	}
    	
    	for(int i =0;i<=N;i++) {
    		for(int j =1;j<=W;j++) {
        		if(j<wt[i])
        			dp[i%2][j]=dp[1-(i%2)][j];
        		else
        			dp[i%2][j]=Math.max(val[i]+dp[1-(i%2)][j-wt[i]], dp[1-(i%2)][j]);
        	}
		}
    	System.out.println(dp[N%2][W]);
    	
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