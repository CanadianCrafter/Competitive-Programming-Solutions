import java.util.*;
import java.io.*;
public class USACO19DECBP2WhereAmI {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	String str = readLine();
    	for(int len=1;len<=N;len++) {
    		boolean flag=true;
    		for(int i =0;i+len<=N;i++) {
    			String sub = str.substring(i,i+len);
    			int p1 =str.indexOf(sub);
    			int p2 = str.indexOf(sub,p1+1);
    			if(p2!=-1) {
    				flag=false;
    				break;
    			}
    		}
    		if(flag) {
				System.out.println(len);
				return;
			}
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