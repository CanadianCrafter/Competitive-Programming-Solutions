import java.util.*;
import java.io.*;
public class CCC13S1From1987To2013 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n; 
    public static void main(String[] args) throws IOException {
    	n = readInt();
    	
    	do {
    		n++;
    		
    	}while(!check());
    	System.out.println(n);
    }
    private static boolean check() {
		ArrayList <Character> nums = new ArrayList<Character>();
		String str = Integer.toString(n);
		for(int i =0;i<str.length();i++) {
			if(nums.contains(str.charAt(i))) return false;
			else nums.add(str.charAt(i));
		}
				
		return true;
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