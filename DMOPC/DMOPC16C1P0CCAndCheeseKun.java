import java.util.*;
import java.io.*;
public class DMOPC16C1P0CCAndCheeseKun {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int W = readInt();
    	int C = readInt();
    	if(W==3&&C>=95) {
    		System.out.println("C.C. is absolutely satisfied with her pizza.");
    	}
    	else if(W==1&&C<=50) {
    		System.out.println("C.C. is fairly satisfied with her pizza.");
    	}
    	else {
    		System.out.println("C.C. is very satisfied with her pizza.");
    	}
    	
    }
    private static int gcd(int x, int y) {
		if(y==0)return x;
		return gcd(y,x%y);
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