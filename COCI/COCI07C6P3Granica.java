import java.util.*;
import java.io.*;
public class COCI07C6P3Granica {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	int arr[]= new int [N];
    	for(int i =0;i<N;i++)arr[i]=readInt();
    	Arrays.sort(arr);
    	int difGCD = arr[1]-arr[0];
    	for(int i =2;i<N;i++) {
    		difGCD=gcd(difGCD,arr[i]-arr[i-1]);
    	}
    	for(int i =2;i<=Math.sqrt(difGCD);i++) {
    		if(difGCD%i==0) {
    			System.out.print(i+" ");
    			if(Math.pow(i, 2)!=difGCD)System.out.print(difGCD/i+" ");
    		}
    	}
    	System.out.println(difGCD);
    }
    private static int gcd(int x, int y) {
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