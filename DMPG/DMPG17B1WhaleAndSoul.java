import java.util.*;
import java.io.*;
public class DMPG17B1WhaleAndSoul {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	int bestC=Integer.MAX_VALUE;
    	int bestD=0;
    	for(int i =0;i<N;i++) {
    		int c = readInt();
    		int d = readInt();
    		if(d>bestD) {
    			bestD=d;
    			bestC=c;
    		}
    		else if(d==bestD) {
    			bestC=Math.min(bestC, c);
    		}
    	}
    	System.out.println(bestC+" "+bestD);
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