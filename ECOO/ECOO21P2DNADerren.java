import java.util.*;
import java.io.*;
public class ECOO21P2DNADerren {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	String str = readLine();
    	String tmp = "";
    	boolean vowel;
    	if(str.charAt(0)=='A') 
    		vowel = true;
    	else 
    		vowel = false;
    	tmp+=str.charAt(0);
    	for(int i =1;i<str.length();i++) {
    		boolean flag;
    		if(str.charAt(i)=='A') 
        		flag = true;
        	else 
        		flag = false;
    		
    		if(flag==vowel) {
    			System.out.print(tmp+" ");
    			tmp="";
    			tmp+=str.charAt(i);
    		}
    		else {
    			tmp+=str.charAt(i);
    		}
    		
    		
    		if(str.charAt(i)=='A') 
        		vowel = true;
        	else 
        		vowel = false;
    	}
    	System.out.print(tmp);
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