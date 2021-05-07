import java.util.*;
import java.io.*;
public class ECOO21P1ManyMessages {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int start = readInt();
    	int interval = readInt();
    	int time = readInt();
    	if(time<=start+interval)System.out.println(start+interval);
    	else if(time<=start+2*interval)System.out.println(start+2*interval);
    	else if(time<=start+3*interval)System.out.println(start+3*interval);
    	else System.out.println("Who knows...");
    	
    			
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