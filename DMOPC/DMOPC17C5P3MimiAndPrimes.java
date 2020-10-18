import java.util.*;
import java.io.*;
public class DMOPC17C5P3MimiAndPrimes {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	long arr[]=new long [N];
    	arr[0]=readLong();
    	for(int i =1;i<N;i++) {
    		arr[i]=gcd(readLong(),arr[i-1]);
    	}
    	long ans = largestPrimeFactor(arr[N-1]);
    	if(ans==Integer.MIN_VALUE)System.out.println("DNE");
    	else System.out.println(ans);
    	
    }
    
    private static long largestPrimeFactor(long num) {
    	long max=Integer.MIN_VALUE;
    	while(num%2==0) {
    		num/=2;
    		max=2;
    	}
    	for(int i = 3; i<=Math.sqrt(num); i+=2) {
            while(num%i == 0) {
            	max=Math.max(max,i);
            	num = num/i;
            }
         }
    	if(num>2)max=Math.max(num, max);
		return max;
	}

	private static long gcd(long x, long y) {
		if(y==0)return x;
		return gcd(y,x%y);
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