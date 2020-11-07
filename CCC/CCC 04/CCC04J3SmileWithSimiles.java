import java.util.*;
import java.io.*;
public class CCC04J3SmileWithSimiles {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	int M = readInt();
    	String adjs[] = new String[N];
    	String nouns[] = new String[M];
    	for(int i =0;i<N;i++)
    		adjs[i]=next();
    	for(int i =0;i<M;i++)
    		nouns[i]=next();
    	for(int i =0;i<N;i++) {
    		for(int j =0;j<M;j++)
    			System.out.printf("%s as %s\n",adjs[i],nouns[j]);
    		
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