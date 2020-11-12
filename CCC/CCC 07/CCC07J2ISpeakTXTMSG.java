import java.util.*;
import java.io.*;
public class CCC07J2ISpeakTXTMSG {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	Map<String,String> map = new HashMap();
    	map.put("CU","see you" );
    	map.put(":-)","I'm happy" );
    	map.put(":-(","I'm unhappy" );
    	map.put(";-)","wink" );
    	map.put(":-P	s","stick out my tongue" );
    	map.put("(~.~)","sleepy" );
    	map.put("TA","totally awesome" );
    	map.put("CCC","Canadian Computing Competition" );
    	map.put("CUZ","because" );
    	map.put("TY","thank-you" );
    	map.put("YW","you're welcome" );
    	map.put("TTYL","talk to you later" );
    	
    	String str = "";
    	do {
    		str = next();
    		if(map.containsKey(str)) System.out.println(map.get(str));
    		else System.out.println(str);
    	}while(!str.equals("TTYL"));
    	
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