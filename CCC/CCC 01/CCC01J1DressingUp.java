import java.util.*;
import java.io.*;
public class CCC01J1DressingUp {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int H = readInt();
    	int ch = 1;    	
    	for(int i = 0;i<H;i++) {
    		for(int j = 0;j<ch;j++) System.out.print("*");
    		for(int j = 0;j<2*(H-ch);j++) System.out.print(" ");
    		for(int j = 0;j<ch-1;j++) System.out.print("*");
    		System.out.println("*");
    		
    		if(2*(i+1)<(H))ch+=2;
    		else ch-=2;
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