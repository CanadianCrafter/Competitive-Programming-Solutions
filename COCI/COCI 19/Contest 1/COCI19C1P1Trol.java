import java.util.*;
import java.io.*;
public class COCI19C1P1Trol {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	long Q = readInt();
    	for(int i =0;i<Q;i++) {
    		long l = readLong();
    		long r = readLong();
    		long pos;
    		if(l%9==0) pos = 9;
    		else pos = l%9;
    		long sum = 45*((r-l+1)/9);
    		for(int j =0;j<(((r-l+1)%9)+9)%9;j++) {
    			sum+=pos;
    			pos++;
    			if(pos!=9) pos%=9;
    		}
    		System.out.println(sum);
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