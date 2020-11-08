import java.util.*;
import java.io.*;
public class CCC05J1TheCellSell {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int x = readInt();
    	int y = readInt();
    	int z = readInt();
    	
    	double A = ((x<100)?0:(double)(x-100)*0.25)+(double)y*0.15+(double)0.20*z;
    	double B = ((x<250)?0:(double)(x-250)*0.45)+(double)y*0.35+(double)0.25*z;
    	System.out.printf("Plan A costs %.2f\n",A);
    	System.out.printf("Plan B costs %.2f\n",B);
    	String strA = String.format("%.2f",A);
    	String strB = String.format("%.2f",B);
    	if(strA.equals(strB))System.out.println("Plan A and B are the same price.");
    	else System.out.printf(A>B?"Plan B is cheapest.":"Plan A is cheapest.");
    	
    	
    	
    	
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