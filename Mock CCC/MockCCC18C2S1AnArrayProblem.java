import java.util.*;
import java.io.*;
public class MockCCC18C2S1AnArrayProblem {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	int arr[]=new int [N];
    	int max=0;
    	long sum=0;
    	for(int i =0;i<N;i++) {
    		arr[i]=readInt();
    		sum+=arr[i];
    		if(arr[i]>max) max=arr[i];
    	}
    	if(max>=sum-max)System.out.println(sum-max);
    	else System.out.println(sum/2);
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