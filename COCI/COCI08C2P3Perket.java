import java.util.*;
import java.io.*;
public class COCI08C2P3Perket {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int N;
    static int ans;
    static int sArr[];
    static int bArr[];
    public static void main(String[] args) throws IOException {
    	N = readInt();
    	int s = 1;
    	int b = 0;
    	ans = Integer.MAX_VALUE;
    	sArr = new int[N];
    	bArr = new int[N];
    	for(int i =0;i<N;i++) {
    		sArr[i]=readInt();
    		bArr[i]=readInt();
    	}
    	fun(s,b,0);
    	System.out.println(ans);
    }
    private static void fun(int s, int b, int i) {
		if(i==N) {
			if(s==1)return;
			if(Math.abs(s-b)<ans)ans = Math.abs(s-b);
			return;
		}
		fun(s,b,i+1);
		fun(s*sArr[i],b+bArr[i],i+1);
		
		
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