import java.util.Stack;
import java.util.*;
import java.io.*;
public class PostfixNotation {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
		Stack<Double> vals = new Stack<Double>();
		String arr[] = readLine().split("[ ]");
		for(int i = 0; i<arr.length;i++) {
			String s = arr[i];
			if(!s.equals("*")&&!s.equals("/")&&!s.equals("+")&&!s.equals("-")&&!s.equals("%")&&!s.equals("^")) {
				vals.push((Double.parseDouble(arr[i])));
			}
				
			else {
				double v1 = vals.pop();
				double v2 = vals.pop();
				
				
				if(s.equals("*")) vals.push(v2*v1);
				else if(s.equals("/")) vals.push(v2/v1);
				else if(s.equals("+")) vals.push(v2 + v1);
				else if(s.equals("-")) vals.push(v2 - v1);
				else if(s.equals("%")) vals.push(v2 % v1);
				else if(s.equals("^")) vals.push(Math.pow(v2,v1));
			}
		}
		
		System.out.printf("%.1f", vals.pop());
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
