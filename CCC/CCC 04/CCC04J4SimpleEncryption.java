import java.util.*;
import java.io.*;
public class CCC04J4SimpleEncryption {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	String key = next();
    	String msg = readLine();
    	String newMsg = "";
    	for(int i =0;i<msg.length();i++) if((int) msg.charAt(i)>=65&&(int) msg.charAt(i)<=90) newMsg+=msg.charAt(i);
        	for(int i =0;i<newMsg.length();i++) {
        		char ch = (char) ((((int)newMsg.charAt(i)+(int) key.charAt(i%key.length())-130)%26)+65);
        		System.out.print(ch);
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