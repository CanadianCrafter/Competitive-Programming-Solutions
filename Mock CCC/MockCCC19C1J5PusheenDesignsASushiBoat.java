import java.util.*;
import java.io.*;
public class MockCCC19C1J5PusheenDesignsASushiBoat {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	int K = readInt();
    	int cnt[]  =new int [N+1];
    	for(int i =1;i<=N;i++)
    		cnt[readInt()]++;
    	long dp[][] = new long[N+1][K+1];
    	long mod = 998244353;
    	dp[0][0]=1;
    	for(int i =1;i<=N;i++) {
    		dp[i][0]=1;
    		for(int j =1;j<=K;j++) {
    			dp[i][j]=(dp[i-1][j]+dp[i-1][j-1]*cnt[i])%mod;
    		}
    	}
    	System.out.println(dp[N][K]);
    	
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