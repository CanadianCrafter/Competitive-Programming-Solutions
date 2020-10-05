import java.util.*;
import java.io.*;
public class CCC96S5MaximumDistance {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	for(int i=0;i<N;i++) {
    		int n = readInt();
    		int ans =0;
    		int arrA[] =new int[n];
    		int arrB[] =new int[n];
    		for(int j = 0;j<n;j++) {
    			arrA[j] = readInt();
    		}
    		for(int j = 0;j<n;j++) {
    			arrB[j] = readInt();
    		}
    		for(int j = 0;j<n;j++) {
    			int count = 0;
    			for(int k = j;k<n;k++) {
        			if(arrB[k]>=arrA[j]) count++;
        		}
    			if(count-1>ans) ans=count-1;
    		}
    		System.out.println("The maximum distance is "+ ans);
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