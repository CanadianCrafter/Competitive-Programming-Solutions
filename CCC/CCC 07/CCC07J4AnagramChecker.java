import java.util.*;
import java.io.*;
public class CCC07J4AnagramChecker {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	String str = readLine().toLowerCase();
    	ArrayList<Character> a1 = new ArrayList<Character>();
    	for(int i =0;i<str.length();i++ ) {
    		if(str.charAt(i)!=' ') a1.add(str.charAt(i));
    	}
    	String str2 = readLine().toLowerCase();
    	ArrayList<Character> a2 = new ArrayList<Character>();
    	for(int i =0;i<str2.length();i++ ) {
    		if(str2.charAt(i)!=' ') a2.add(str2.charAt(i));
    	}
    	Collections.sort(a1);
    	Collections.sort(a2);
    	if(a1.equals(a2)) System.out.println("Is an anagram.");
    	else System.out.println("Is not an anagram.");
    	
    	
    		
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