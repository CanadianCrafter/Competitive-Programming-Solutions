import java.util.*;
import java.io.*;
public class CCC05J3ReturningHome {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	Stack <String> str = new Stack<String>();
    	String in;
    	while(!(in = next()).equals("SCHOOL")) {
    		str.push(in);    		
    	}
    	while(!str.isEmpty()) {
    		System.out.print("Turn ");
    		String s1 = str.pop();
    		if(s1.equals("R")) System.out.print("LEFT");
    		else if(s1.equals("L")) System.out.print("RIGHT");
    		
    		if(str.isEmpty()) break;
     		System.out.print(" onto ");
     		System.out.print(str.pop());    		
    		System.out.println(" street.");
    	}
    	System.out.println(" into your HOME.");
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