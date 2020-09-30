import java.util.*;
import java.io.*;
public class COCI14C5P3Traktor {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	int K = readInt();
    	int rows[]=new int[100000];
    	int columns[]=new int[100000];
    	int rD[]=new int[2*100000-1];
    	int lD[]=new int[2*100000-1];
    	int time=0;
    	for(int i=0;i<N;i++) {
    		int x = readInt();
    		int y = readInt();
    		rows[y-1]++;
    		columns[x-1]++;
    		lD[x+y-2]++;
    		rD[y-x-1+N]++;
    		time++;
    		if(rows[y-1]==K||columns[x-1]==K||lD[x+y-2]==K||rD[y-x-1+N]==K) {
    			System.out.println(time);
    			return;
    		}
    	}
    	System.out.println(-1);
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