import java.util.*;
import java.io.*;
public class CCC15J1SpecialDay {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int m = readInt();
    	int d = readInt();
    	if (m>=3) {
    		System.out.println("After");
    	}
    	else if(m<=1) {
    		System.out.println("Before");
    	}
    	else if(d<18) {
    		System.out.println("Before");
    	}
    	else if(d>18) {
    		System.out.println("After");
    	}
    	else {
    		System.out.println("Special");
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