import java.util.*;
import java.io.*;
public class CCC01J2ModInverse {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int x = readInt();
    	int m = readInt();
    	check(x,m);
    	
    }
    private static void check(int x, int m) {
    	for(int n=1;n<m;n++) {
    		if((x*n)%m==1) {
    			System.out.println(n);
    			return;
    		}
    	}
    	System.out.println("No such integer exists.");
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