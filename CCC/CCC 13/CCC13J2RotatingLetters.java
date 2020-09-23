import java.util.*;
import java.io.*;
public class CCC13J2RotatingLetters {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static String str;
    public static void main(String[] args) throws IOException {
    	str = readLine();
    	
    	if(!check())	System.out.println("NO");
    	else System.out.println("YES");
    	
    }
    private static boolean check() {
    	for(int i = 0; i<str.length();i++) {
    		if(str.charAt(i) !='I'&& str.charAt(i) !='O'&&str.charAt(i) !='S'&&str.charAt(i) !='H'&&str.charAt(i) !='Z'&&str.charAt(i) !='X'&&str.charAt(i) !='N') {
    			return false;
    		}		
		}
    	return true;
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