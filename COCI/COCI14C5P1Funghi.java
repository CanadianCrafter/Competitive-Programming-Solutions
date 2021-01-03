
import java.util.*;
import java.io.*;
public class COCI14C5P1Funghi {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int a[] = new int [8];
    	int ans=0;
    	for(int i=0; i<8;i++) {
    		a[i] = readInt();
    	}
    	for(int i =0; i<8;i++) {
    		int total=0;
    		for(int j = 0; j<4;j++) {
    			total+=a[(i+j)%8];
    		}
    		if (total>ans)ans=total;
    	}
    	System.out.println(ans);
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
