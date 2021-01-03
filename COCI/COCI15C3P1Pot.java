import java.util.*;
import java.io.*;
public class COCI15C3P1Pot {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	int sum = 0;
    	for(int i =0;i<N;i++) {
    		String str = readLine();
    		int num = Integer.parseInt(str.substring(0,str.length()-1));
    		int pow = Character.getNumericValue(str.charAt(str.length()-1));
    		sum+=Math.pow(num, pow);
    	}
    	System.out.println(sum);
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