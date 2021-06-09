import java.util.*;
import java.io.*;
public class BigDeposits {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static long P,Y,T;
    public static void main(String[] args) throws IOException {
    	P = readLong();
    	Y  =readLong();
    	T  = readLong();
    	long low = 1;
    	long high = T;
    	long ans =0;
    	//binary search
    	while(low<=high) {
    		long mid = (low+high)/2;
    		if(check(mid)) {
    			ans=mid;
    			high = mid-1;
    		}
    		else {
    			low=mid+1;
    		}
    			
    	}
    	System.out.println(ans);
    	
    }
    private static boolean check(long X) {
		long val=0;
		for(long i =1;i<=Y;i++) {
			val+=X;
			val+=(val*P)/100;
			if(val>=T)return true;
		}
		return false;
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