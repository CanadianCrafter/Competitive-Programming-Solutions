import java.util.*;
import java.io.*;
public class TLE16C2P1InDebt {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	int min=Integer.MAX_VALUE;
    	int minID=0;
    	int sum=0;
    	for(int i =0;i<N;i++) {
    		String str[]  =readLine().split(" ");
    		if(str[0].equals("borrow"))sum-=Integer.parseInt(str[1]);
    		else sum+=Integer.parseInt(str[1]);
    		if(sum<min&&sum<0) {
    			min=sum;
    			minID=i+1;
    		}
    	}
    	System.out.println(minID);
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