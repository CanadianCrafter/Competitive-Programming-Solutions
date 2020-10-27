import java.util.*;
import java.io.*;
public class DWITE08R3P2Wordcount {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	for(int i =0;i<5;i++) {
    		String arr[] = readLine().split("[ \' ]");
    		int cnt =0;
    		for(int j=0;j<arr.length;j++) {
    			int check =0;
    			for(int k =0;k<arr[j].length();k++) {
    				if((int)arr[j].toUpperCase().charAt(k)<=90&&(int)arr[j].toUpperCase().charAt(k)>=65) check++;
    			}
    			if(check>3)cnt++;
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