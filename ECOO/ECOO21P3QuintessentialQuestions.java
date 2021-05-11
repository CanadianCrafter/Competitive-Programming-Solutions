import java.util.*;
import java.io.*;
public class ECOO21P3QuintessentialQuestions {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	int M = readInt();
    	int K = readInt();
    	int max[] = new int[N+1];
    	int prof[] = new int[N+1];
    	Arrays.fill(prof,-1);
    	for(int i =0;i<K;i++) {
    		int A = readInt();
        	int B = readInt();
        	int C = readInt();
        	if(max[B]<C) {
        		max[B]=C;
        		prof[B]=A;
        	}
        	
    	}
    	
    	for(int i =1;i<=N;i++) {
    		System.out.print(prof[i]+" ");
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