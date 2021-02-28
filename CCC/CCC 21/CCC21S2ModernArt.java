import java.util.*;
import java.io.*;
public class CCC21S2ModernArt {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int M = readInt();
    	int N = readInt();
    	int K = readInt();
    	long row[] = new long [M];
    	long col[]=new long[N];
    	
    	for(int i =0;i<K;i++) {
    		char ch = next().charAt(0);
    		int n = readInt()-1;
    		if(ch=='R')
    			row[n]++;
    		else 
    			col[n]++;
    	}
    	long ans =0;
    	for(int i =0;i<M;i++) {
    		for(int j=0;j<N;j++) {
    			if((col[j]+row[i])%2==1)ans++;
    		}
    	}
    	System.out.println(ans);
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