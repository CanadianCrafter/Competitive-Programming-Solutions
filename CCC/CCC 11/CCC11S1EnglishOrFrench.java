import java.util.*;
import java.io.*;
public class CCC11S1EnglishOrFrench {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N  = readInt();
    	int countT = 0;
    	int countS = 0;
    	for(int k = 0; k<N;k++) {
    		String str = readLine();
    		str = str.toUpperCase();
        	for(int i =0; i < str.length();i++) {
        		if(str.charAt(i) == 'T') countT++;
        		else if(str.charAt(i) == 'S') countS++;
        	}
    	}
    	if(countT>countS) {
    		System.out.println("English");
    	}
    	else {
    		System.out.println("French");
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