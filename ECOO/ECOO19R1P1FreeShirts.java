import java.util.*;
import java.io.*;
public class ECOO19R1P1FreeShirts {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	for(int a=0;a<10;a++) {
    		int N = readInt();
        	int M = readInt();
        	int D = readInt();
        	int events[]=new int [D+1];
        	int shirts=N;
        	int ans=0;
        	for(int i=0;i<M;i++)events[readInt()]++;
        	for(int i =1;i<D;i++) {
        		shirts--;
        		shirts+=events[i];
        		N+=events[i];
        		if(shirts==0) {
        			shirts=N;
        			ans++;
        		}
        	}
        	System.out.println(ans);
        	
        	
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