import java.util.*;
import java.io.*;
public class DWITE09R6P4TimeForChange {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	for(int t=0;t<5;t++) {
    		int D = readInt();
        	int N = readInt();
        	int coins[] = new int[N+1];
        	long dp[]= new long[D+1];
        	
        	Arrays.fill(dp, D+1);
        	
        	for(int i =1;i<=N;i++)
        		coins[i]=readInt();
        	
        	dp[0]=0;
        	for(int i =1;i<=D;i++) {
        		for(int j =1;j<=N;j++) {
        			if(coins[j]<=i) {
        				dp[i]=Math.min(dp[i], dp[i-coins[j]]+1);
        			}
        		}
        	}
        	System.out.println(dp[D]);
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