import java.util.*;
import java.io.*;
public class MaxGCD {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	int arr[] = new int [N];
    	for(int i =0;i<N;i++) {
    		arr[i]=readInt();
    	}
    	int pre[] = new int[N];
    	pre[0]=arr[0];
    	for(int i =1;i<N;i++) {
    		pre[i]=gcd(pre[i-1],arr[i]);
    	}
    	
    	int suf[] = new int[N];
    	suf[N-1]=arr[N-1];
    	for(int i =N-2;i>=0;i--) {
    		suf[i]=gcd(suf[i+1],arr[i]);
    	}
    	int ans=suf[1];
    	for(int i =1;i<N-1;i++) {
    		ans = Math.max(ans,gcd(pre[i-1], suf[i+1]));
    	}
    	ans = Math.max(ans,pre[N-2]);
    	System.out.println(ans);
    	
    }
   public static int gcd(int x, int y){
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