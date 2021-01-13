import java.util.*;
import java.io.*;
public class DMOPC17C2P0Secrets {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int x1 = readInt();
    	int y1 = readInt();
    	int x2 = readInt();
    	int y2 = readInt();
    	int xs = readInt();
    	int ys = readInt();
    	int D = readInt();
    	if(Math.sqrt(Math.pow(x1-xs, 2)+Math.pow(y1-ys, 2))<=D||Math.sqrt(Math.pow(x2-xs, 2)+Math.pow(y2-ys, 2))<=D) {
    		System.out.println("Yes");
    	}
    	else {
    		System.out.println("No");
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