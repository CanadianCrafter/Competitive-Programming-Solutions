import java.util.*;
import java.io.*;
public class CCCHK15J3QueensCantAttackMe {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	int M = readInt();
    	boolean rows[]=new boolean[N];
    	boolean columns[]=new boolean[N];
    	boolean rD[]=new boolean[2*N-1];
    	boolean lD[]=new boolean[2*N-1];
    	Arrays.fill(rows, false);
    	Arrays.fill(columns, false);
    	Arrays.fill(rD, false);
    	Arrays.fill(lD, false);
    	for(int i =0;i<M;i++) {
    		int y = readInt();
    		int x = readInt();
    		rows[y-1]=true;
    		columns[x-1]=true;
    		lD[x+y-2]=true;
    		rD[y-x-1+N]=true;
    	}
    	int cnt=0;
    	for(int i =0;i<N;i++) {
    		for(int j =0;j<N;j++)
    			if(!rows[i]&&!columns[j]&&!lD[i+j]&&!rD[i-j-1+N])cnt++;
    	}
    	System.out.println(cnt);
    	
    
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