import java.util.*;
import java.io.*;
public class LCS {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	String s = readLine();
    	String t = readLine();
    	int dp[][]=new int[s.length()+1][t.length()+1];
    	
    	for(int i =0;i<=s.length();i++) {
    		for(int j =0;j<=t.length();j++) {
    			if(i==0||j==0)
    				dp[i][j]=0;
    			else if(s.charAt(i-1)==t.charAt(j-1))
    				dp[i][j]= 1+ dp[i-1][j-1];
    			else 
    				dp[i][j]= Math.max(dp[i][j-1],dp[i-1][j]);
        	}
    	}
    	int index = dp[s.length()][t.length()];
    	int tmp  =index;
    	
    	char lcs[] = new char[index];
    	
    	int i = s.length();
    	int j = t.length();
    	while(i>0&&j>0) {
    		if(s.charAt(i-1)==t.charAt(j-1)) {
    			lcs[index-1]=s.charAt(i-1);
    			i--;
    			j--;
    			index--;
    		}
    		
    		else if (dp[i-1][j]>dp[i][j-1])
    			i--;
    		else
    			j--;
    	}
    	for(int k =0;k<tmp;k++)
    		System.out.print(lcs[k]);
    	System.out.println();
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