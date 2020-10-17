import java.util.*;
import java.io.*;
public class DMOPC15C3P2CheeseCakeDistribution {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	long ans = 0;
    	long sum = 0;
    	long arr[] = new long[N];
    	for(int i =0;i<N;i++) {
    		long j = readLong();
    		arr[i]=j;
    		sum+=j;
    	}
    	
    	if(sum%N!=0) {
    		System.out.println("Impossible");
    		return;
    	}
    	sum/=N;
    	long dif=0;
    	for(int i =0;i<N;i++) {
    		dif+=Math.abs(arr[i]-sum);
    	}
    	System.out.println(dif/2);

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