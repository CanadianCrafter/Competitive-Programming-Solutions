import java.util.*;
import java.io.*;
public class CCC05S4PyramidMessageScheme {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int L = readInt();
    	for(int i =0;i<L;i++) {
    		int N = readInt();
    		String str[] = new String[N];
    		for(int j =0;j<N;j++) {
    			str[j]=next();
    		}
    		HashMap<String, Integer> map = new HashMap();
    		map.put(str[N-1], 0);
    		int cur =0;
    		int depth=0;
    		//find the depth of the tree
    		for(int j =0;j<N;j++) {
    			if(!map.containsKey(str[j])) {
    				cur++;
    				map.put(str[j], cur);
    				depth = Math.max(depth, cur);
    			}
    			else 
    				cur = map.get(str[j]);
    		}
    		System.out.println(N*10-depth*20);
    		
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