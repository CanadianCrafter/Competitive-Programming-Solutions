import java.util.*;
import java.io.*;
public class CCC03J2PicturePerfect {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int C=0; 
    	do {
    		C= readInt();
    		for(int i =(int) Math.sqrt(C);i>=1;i++) {
    			if(C%i==0) {
    				int n=C/i;
    				System.out.printf("Minimum perimeter is %d with dimensions %d x %d\n",(2*(n+i)),i,n);
    				break;
    			}
    		}
    	}while(C!=0);
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