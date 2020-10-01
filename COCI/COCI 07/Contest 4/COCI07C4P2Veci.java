import java.util.*;
import java.io.*;
public class COCI07C4P2Veci {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int n = readInt();
    	char digit[] = String.valueOf(n).toCharArray();
    	Arrays.sort(digit);
    	for(int i=n+1;;i++) {
    		char cur[] = String.valueOf(i).toCharArray();
    		if(cur.length != digit.length) { System.out.println(0); break;}
    		Arrays.sort(cur);
    		if(Arrays.equals(digit,cur)) {System.out.println(i); break;}
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