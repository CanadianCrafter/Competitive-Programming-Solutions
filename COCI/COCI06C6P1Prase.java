import java.util.*;
import java.io.*;
public class COCI06C6P1Prase {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException  {
    	int n = readInt();
    	int ans = 0;
    	Map<String, Integer> map = new HashMap();
    	for(int i=0;i<n;i++) {
    		String str = next();
    		int num =0;
    		int sum =0;
    		if(map.containsKey(str)) { 
    			num = map.get(str);
    		}
    		for (int val : map.values()) {
    		    sum += val;
    		}
    		if(num>sum-num)ans++;
    		map.put(str,num+1);
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