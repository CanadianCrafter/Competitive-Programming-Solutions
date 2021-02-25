import java.util.*;
import java.io.*;
public class TLE16C7P4AbstractProblem {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int T = readInt();
    	for(int i =0;i<T;i++) {
    		long X = readLong();
    		int cnt = 0;
    		while(X!=0) {
    			if(X==3) {
    				cnt+=3;
    				X=0;
    			}
    			else if(X==Long.MAX_VALUE) {
    				X-=1;
    				X/=2;
    				X+=1;
    				cnt+=2;
    			}
    			else if(X%2==0) {
    				X/=2;
    				cnt++;
    			}
    			else if(X%4==1) {
    				X--;
    				cnt++;
    			}
    			else if(X%4==3) {
    				X++;
    				cnt++;
    			}
    		}
        	System.out.println(cnt);
    		
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