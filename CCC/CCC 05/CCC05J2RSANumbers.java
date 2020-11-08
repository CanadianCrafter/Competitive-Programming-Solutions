import java.util.*;
import java.io.*;
public class CCC05J2RSANumbers {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int x = readInt();
    	int y = readInt();
    	int ans=0;
    	for(int i =x;i<=y;i++) {
    		int cnt=0;
    		for(int j =1;j<=i;j++) {
    			if(i%j==0)cnt++;
    		}
    		if(cnt==4)ans++;
    	}
    	System.out.printf("The number of RSA numbers between %d and %d is %d",x,y,ans);
    	
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