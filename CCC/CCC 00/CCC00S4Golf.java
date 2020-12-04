import java.util.*;
import java.io.*;
public class CCC00S4Golf {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int D = readInt();
    	int N = readInt();
    	int wt[] = new int[N+1];
    	long dp[]= new long[D+1];
    	
    	Arrays.fill(dp, D+1);
    	
    	for(int i =1;i<=N;i++)
    		wt[i]=readInt();
    	
    	dp[0]=0;
    	for(int i =1;i<=D;i++) {
    		for(int j =1;j<=N;j++) {
    			if(wt[j]<=i) {
    				dp[i]=Math.min(dp[i], dp[i-wt[j]]+1);
    			}
    		}
    	}
    	
    	System.out.println(dp[D]!=D+1?String.format("Roberta wins in %d strokes.",dp[D]):"Roberta acknowledges defeat.");
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