import java.util.*;
import java.io.*;
public class CCCHK08J1BestFish {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int C = readInt();
    	int maxC = 0;
    	for(int i =0;i<C;i++) {
    		int num = readInt()*readInt();
    		if(num>maxC) maxC = num;
    	}
    	int N = readInt();
    	int maxN = 0;
    	for(int i =0;i<N;i++) {
    		int num = readInt()*readInt();
    		if(num>maxN) maxN = num;
    	}
    	if(maxC>maxN)System.out.println("Casper");
    	else if(maxN>maxC)System.out.println("Natalie");
    	else System.out.println("Tie");
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