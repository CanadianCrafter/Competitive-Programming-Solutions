import java.util.*;
import java.io.*;
public class USACO20JANBP1WordProcessor {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	int K = readInt();
    	String arr[] = readLine().split("[ ]");
    	int len=0;
    	for(int i=0;i<N;i++){
    		if(arr[i].length()==0)continue;
    		if(arr[i].length()+len>K) {
    			System.out.println();
    			System.out.print(arr[i]);
    			len=arr[i].length();
    		}
    		else if(len==0) {
    			System.out.print(arr[i]);
    			len=arr[i].length();
    		}
    		else {
    			System.out.print(" "+arr[i]);
    			len+=arr[i].length();
    		}
    		
    	}
    	System.out.println();
    	
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