import java.util.*;
import java.io.*;
public class VM7WC16C3P1ShahirInABox {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	int maxX=0;
    	int maxY=0;
    	int minX=Integer.MAX_VALUE;
    	int minY=Integer.MAX_VALUE;
    	for(int i =0;i<N;i++) {
    		int x = readInt();
    		int y = readInt();
    		maxX=Math.max(maxX, x);
    		maxY=Math.max(maxY, y);
    		minX=Math.min(minX, x);
    		minY=Math.min(minY, y);
    	}
    	System.out.println((maxX-minX)*(maxY-minY));
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