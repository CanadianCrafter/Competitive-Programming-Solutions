import java.util.*;
import java.io.*;
public class CCC08S2PenniesInTheRing {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	while(true) {
    		int R = readInt();
    		int cnt =0;
    		if(R==0)break;
    		for(int i =0;i<R;i++){
    				cnt+=(int)Math.sqrt(R*R-i*i);
    		}
    		System.out.println(cnt*4+1);
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