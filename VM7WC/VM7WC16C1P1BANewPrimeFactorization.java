import java.util.*;
import java.io.*;
public class VM7WC16C1P1BANewPrimeFactorization {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int Y = readInt();
    	while(Y%2==0) {
    		System.out.println(2);
    		Y/=2;
    	}
    	for(int i =3;i<=Math.sqrt(Y);i+=2) {
    		while(Y%i==0) {
    			System.out.println(i);
    			Y/=i;;
    		}
    	}
    	if(Y>2)
    		System.out.println(Y);
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