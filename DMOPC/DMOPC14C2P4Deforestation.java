import java.util.*;
import java.io.*;
public class DMOPC14C2P4Deforestation {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	int arr[] = new int [N+1];
    	arr[0] =0;
    	for(int i=1;i<N+1;i++) arr[i]=arr[i-1]+readInt();
    	int Q = readInt();
    	for(int i =0;i<Q;i++) {
    		int a = readInt()+1;
    		int b = readInt()+1;
    		System.out.println(arr[b]-arr[a-1]);
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