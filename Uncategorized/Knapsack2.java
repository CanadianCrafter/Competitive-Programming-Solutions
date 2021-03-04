import java.util.*;
import java.io.*;
public class Knapsack2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	//you can switch the capacity and value dimensions since one dimension is smaller
    	int N = readInt();
    	int W = readInt();
    	int maxV = (int) 1e5;
    	long dp[]=new long[maxV+1];
    	Arrays.fill(dp, (long) 2e9);
    	dp[0]=0;
    	for(int i =0;i<N;i++) {
    		int w = readInt();
    		int val = readInt();
    		for(int j =maxV;j>=val;j--) {
    			dp[j] = Math.min(dp[j], dp[j-val]+w);
    		}
    	}
    	for(int i =maxV;i>=0;i--) {
    		if(dp[i]<=W) {
    			System.out.println(i);
    			return;
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