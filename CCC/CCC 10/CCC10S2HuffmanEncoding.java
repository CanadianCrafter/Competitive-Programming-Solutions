import java.util.*;
import java.io.*;
public class CCC10S2HuffmanEncoding {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int k = readInt();
    	Map<String,Character> map = new HashMap();
    	for(int i =0;i<k;i++) {
    		char ch = readCharacter();
    		String code = next();
    		map.put(code, ch);
    	}
    	String str = next();
    	String ans = "";
    	String hold = "";
    	for(int i =0;i<str.length();i++) {
    		hold += str.charAt(i);
    		if(map.get(hold)!=null) {
    			ans +=map.get(hold);
    			hold = "";
    		}
    		
    	}
    	System.out.println(ans);
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