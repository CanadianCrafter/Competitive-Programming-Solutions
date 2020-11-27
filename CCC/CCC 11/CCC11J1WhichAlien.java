import java.util.*;
import java.io.*;
public class CCC11J1WhichAlien {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int a = readInt();
    	int e = readInt();
    	boolean T = true;
    	boolean V= true;
    	boolean G= true;
    	
    	if(a<3)T=false;
    	if(a>6)V= false;
    	if(a>2)G = false;
    	if(e>4)T=false;
    	if(e<2)V=false;
    	if(e>3)G=false;
    	
    	if(T)System.out.println("TroyMartian");
    	if(V)System.out.println("VladSaturnian");
    	if(G)System.out.println("GraemeMercurian");
   
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