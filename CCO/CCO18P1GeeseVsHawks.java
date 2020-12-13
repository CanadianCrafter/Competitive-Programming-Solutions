import java.util.*;
import java.io.*;
public class CCO18P1GeeseVsHawks {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	int a[]=new int [N];
    	int b[] = new int [N];
    	char chA[] = readLine().toCharArray();
    	for(int i =0;i<N;i++)
    		a[i] = readInt();
    	char chB[] = readLine().toCharArray();
    	for(int i =0;i<N;i++)
    		b[i] = readInt();
    	
    	
    	int dp[][]=new int [N+1][N+1];
    	for(int i =1;i<=N;i++) {
    		for(int j =1;j<=N;j++) {
    			dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
    			if((chA[i-1]=='L'&&chB[j-1]=='W'&&a[i-1]<b[j-1])||
    					(chA[i-1]=='W'&&chB[j-1]=='L'&&a[i-1]>b[j-1])) {
    				dp[i][j] = Math.max(dp[i][j], dp[i-1][j-1]+a[i-1]+b[j-1]);
    			}
    			
    		}
    	}
    	System.out.println(dp[N][N]);
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