import java.util.*;
import java.io.*;
public class VM7WC15C1P1BGoon {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	String str[] = readLine().split("-");
    	int sums[]=new int [3];
    	for(int i =0;i<3;i++) {
    		for(int j =0;j<str[i].length();j++) {
    			sums[i]+=Character.getNumericValue(str[i].charAt(j));
    		}
    	}
    	if(sums[0]==sums[1]&&sums[0]==sums[2])System.out.println("Goony!");
    	else System.out.println("Pick up the phone!");
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