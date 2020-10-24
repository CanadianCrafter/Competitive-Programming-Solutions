import java.util.*;
import java.io.*;
public class CCCHK08J2LuckyNumber {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	for(int i =0;i<N;i++) {
    		String str = next();
    		long n=0;
    		for(int k =0;k<str.length()/16;k++)  {
    			n+= Long.parseLong(str.substring(16*k,16*(k+1)))%9;
    			n%=9;
    		}
    		n+=Long.parseLong(str.substring(16*(str.length()/16)))%9;
    		n%=9;
    		if (n==0) System.out.println("9");
    		else System.out.println(n);
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