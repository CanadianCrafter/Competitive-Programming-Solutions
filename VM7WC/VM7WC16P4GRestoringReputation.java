import java.util.*;
import java.io.*;
//calculate edit distance
public class VM7WC16P4GRestoringReputation {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int D = readInt();
    	int I = readInt();
    	int R = readInt();
    	char a[] = next().toCharArray();
    	char b[] = next().toCharArray();
    	int N = a.length;
    	int M = b.length;
    	int dp[][]=new int [N+1][M+1];
    	for(int i =0;i<=N;i++) {
    		for(int j =0;j<=M;j++) {
    			//base case
    			if(i==0&&j==0) dp[i][j]=0;
    			else if(i==0)dp[i][j]=j*I; //if a is 0, insert j letters
    			else if(j==0)dp[i][j]=i*D; //ifb is 0, delete i letters
    			//everything else
    			else {
    				if(a[i-1]==b[j-1]) //if they are the same
    					dp[i][j]=dp[i-1][j-1];
    				else { //if they are different
    					//takes the min of inserting, deleting, and replacing
    					dp[i][j] = Math.min(dp[i][j-1]+I,Math.min(dp[i-1][j]+D, dp[i-1][j-1]+R)); 
    				}
    			}
    			
    		}
    	}
    	System.out.println(dp[N][M]);
    	
    	
    	
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