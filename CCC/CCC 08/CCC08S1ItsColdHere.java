import java.util.*;
import java.io.*;
public class CCC08S1ItsColdHere {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	TreeMap<Integer,String> map  =new TreeMap<Integer,String>();
    	while(true) {
    		String city = next();
    		int temp = readInt();
    		map.put(temp,city);
    		if(city.equals("Waterloo"))break;
    	}
    	List<Integer> keys = new ArrayList<>(map.keySet());
    	System.out.println(map.get(keys.get(0)));
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