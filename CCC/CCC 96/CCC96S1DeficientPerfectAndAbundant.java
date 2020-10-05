import java.util.*;
import java.io.*;
public class CCC96S1DeficientPerfectAndAbundant {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	for(int j =0;j<N;j++) {
    		int n = readInt();
            int s=0;
            for(int i=1;i<n;i++)
                if(n%i==0)s+=i;
            if(s>n)System.out.println(n+" is an abundant number.");
            else if(s<n)System.out.println(n+" is a deficient number.");
            else System.out.println(n+" is a perfect number.");
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