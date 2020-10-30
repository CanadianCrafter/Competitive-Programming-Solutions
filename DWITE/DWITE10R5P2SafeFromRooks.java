import java.util.*;
import java.io.*;
public class DWITE10R5P2SafeFromRooks {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	for(int k=0;k<5;k++) {
	    	int R = readInt();
	    	int C = readInt();
	    	int M = readInt();
	    	boolean rows[]=new boolean[R];
	    	boolean columns[]=new boolean[C];
	    	Arrays.fill(rows, false);
	    	Arrays.fill(columns, false);
	    	for(int i =0;i<M;i++) {
	    		int y = readInt();
	    		int x = readInt();
	    		rows[y-1]=true;
	    		columns[x-1]=true;
	    	}
	    	int cntR=0;
	    	for(int i =0;i<R;i++)
	    		if(!rows[i])cntR++;
	    	int cntC=0;
	    	for(int i =0;i<C;i++)
	    		if(!columns[i])cntC++;
	//    	System.out.println(Arrays.toString(rows));
	//    	System.out.println(Arrays.toString(columns));
	    	System.out.println(cntC*cntR);
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