import java.util.*;
import java.io.*;
public class COCI06C5P1Trik {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	char ch[] = readLine().toCharArray();
    	boolean cup[] = new boolean[3];
    	cup[0]=true;
    	for(int i =0;i<ch.length;i++) {
    		boolean tmp;
    		if(ch[i]=='A') {
    			tmp=cup[1];
    			cup[1]=cup[0];
    			cup[0]=tmp;
    		}
    		else if(ch[i]=='B') {
    			tmp=cup[2];
    			cup[2]=cup[1];
    			cup[1]=tmp;
    		}
    		
    		else if(ch[i]=='C') {
    			tmp=cup[2];
    			cup[2]=cup[0];
    			cup[0]=tmp;
    		}
    		
    		
    	}
    	for(int i =0;i<3;i++) {
    		if(cup[i])
    			System.out.println(i+1);
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