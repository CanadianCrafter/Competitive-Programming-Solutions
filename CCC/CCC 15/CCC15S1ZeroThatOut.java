import java.util.*;
import java.io.*;
public class CCC15S1ZeroThatOut {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int K = readInt();
    	int arr[] = new int[K];
    	int total = 0;
    	int index = 0;
    	for(int i = 0; i <K;i++) {
    		int n = readInt();
    		if(n!=0) {
    			arr[index] = n;
    			total+=n;
    			index++;
    		}
    		else {
    			total -=arr[index-1];
    			arr[index-1]=0;
    			index--;
    		}
    	}
    	System.out.println(total);
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