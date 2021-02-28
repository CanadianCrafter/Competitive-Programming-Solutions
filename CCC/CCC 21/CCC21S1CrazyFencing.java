import java.util.*;
import java.io.*;
public class CCC21S1CrazyFencing {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	double arr[] = new double[N];
    	arr[0]=readInt();
    	for(int i =1;i<N;i++) {
    		arr[i]+=readInt();
    		arr[i-1]+=arr[i];
    	}
    	arr[N-1]+=readInt();
    	double ans=0;
    	for(int i=0;i<N;i++) {
    		ans += arr[i]*readInt()/2;
    	}
    	System.out.println(ans*10%10==0?String.format("%.0f",ans ):ans);
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