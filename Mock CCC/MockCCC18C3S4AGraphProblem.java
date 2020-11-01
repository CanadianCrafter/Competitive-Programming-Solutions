import java.util.*;
import java.io.*;
public class MockCCC18C3S4AGraphProblem {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	long sum =0;
    	long max=Integer.MIN_VALUE;
    	for(int i =0;i<N;i++) {
    		int num = readInt();
    		sum+=num;
    		max=Math.max(max, num);
    	}
    	if(sum%2==0&& 2*max<=sum) System.out.println("YES");
    	else System.out.println("NO");
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