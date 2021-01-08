import java.util.*;
import java.io.*;
public class DMOPC14C2P1LoggingLog {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int D = readInt();
    	for(int i =0;i<D;i++) {
    		int T = readInt();
    		if(T==0) {
    			System.out.println("Weekend");
    			continue;
    		}
    		int sum = 0;
    		for(int j =0;j<T;j++) {
    			sum+=readInt();
    		}
    		System.out.println(String.format("Day %d: %d", i+1,sum));
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