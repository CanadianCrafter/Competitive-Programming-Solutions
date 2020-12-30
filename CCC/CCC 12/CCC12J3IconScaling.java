import java.util.*;
import java.io.*;
public class CCC12J3IconScaling {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	char ch[][] = {{'*','x','*'},{' ','x','x'},{'*',' ','*'}};
    	int K = readInt();
    	for(int i =0;i<3;i++) {
    		for(int a=0;a<K;a++) {
    			for(int j =0;j<3;j++) {
    			
        			for(int b =0;b<K;b++) {
        				System.out.print(ch[i][j]);
        			}
        			
    			}
    			System.out.println();
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