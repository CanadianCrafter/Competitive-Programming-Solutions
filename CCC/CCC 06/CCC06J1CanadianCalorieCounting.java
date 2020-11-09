import java.util.*;
import java.io.*;
public class CCC06J1CanadianCalorieCounting {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int a[] = {461,431,420,0};
    	int b[] = {100,57,70,0};
    	int c[] = {130, 160, 118, 0};
    	int d[] = { 167,266,75,0};
    	
    	System.out.printf("Your total Calorie count is %d.",a[readInt()-1]+b[readInt()-1]+c[readInt()-1]+d[readInt()-1]);
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