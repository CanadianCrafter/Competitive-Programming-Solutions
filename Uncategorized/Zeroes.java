import java.util.*;
import java.io.*;
import java.math.*;
public class Zeroes {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	System.out.println(factorial(readInt()));
    }
    
    private static int factorial(int n) {
    	BigInteger k =new BigInteger("1");
    	for(int i =2;i<=n;i++) {
    		k=k.multiply(BigInteger.valueOf(i));
    	}
    	String str = k.toString();
    	int cnt =0;
    	int p2=0;
    	for(int i =0;i<str.length();i++){
    		p2 = str.indexOf('0',p2+1);
    		if(p2==-1)break;
    		cnt++;
    	}
		return cnt;
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