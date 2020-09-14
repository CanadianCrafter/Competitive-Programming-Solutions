import java.util.*;
import java.io.*;
public class CCC03S2Poetry {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	for(int i=0;i<N;i++) {
    		
    		String one = readLine();
    		String two = readLine();
    		String three = readLine();
    		String four = readLine();
    		
    		String s1 = syllable(one.trim());
    		String s2 = syllable(two.trim());
    		String s3 = syllable(three.trim());
    		String s4 = syllable(four.trim());
    		System.out.println();
    		
    		if(s1.equalsIgnoreCase(s2) && s1.equalsIgnoreCase(s3)&&s1.equalsIgnoreCase(s4)) {
    			System.out.print("perfect");
    		}
    		else if(s1.equalsIgnoreCase(s2)&&s3.equalsIgnoreCase(s4)) {
    			System.out.print("even");
    		}
    		else if(s1.equalsIgnoreCase(s3)&&s2.equalsIgnoreCase(s4)) {
    			System.out.print("cross");
    		}
    		else if(s1.equalsIgnoreCase(s4)&&s3.equalsIgnoreCase(s2)) {
    			System.out.print("shell");
    		}
    		else {
    			System.out.print("free");
    		}
    		
    	}
    }
    
    static String syllable(String line) {
    	for(int i = line.length()-1; i>=0;i--) {
    		if(line.charAt(i) == 'a' || line.charAt(i) == 'e'|| line.charAt(i) == 'i' || line.charAt(i) == 'o'|| line.charAt(i) == 'u' || line.charAt(i) == ' ' 
    				|| line.charAt(i) == 'A' || line.charAt(i) == 'E'|| line.charAt(i) == 'I' || line.charAt(i) == 'O'|| line.charAt(i) == 'U' ) {
    			return line.substring(i, line.length()).trim();
    		}
    	}
    	return line;
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