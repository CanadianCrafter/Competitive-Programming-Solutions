import java.util.*;
import java.io.*;
public class CCC12J1SpeedFinesAreNotFine {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int diff = readInt()-readInt();
    	if(diff>=0)System.out.println("Congratulations, you are within the speed limit!");
    	else if (diff<-30)System.out.println("You are speeding and your fine is $500.");
    	else if(diff<-20)System.out.println("You are speeding and your fine is $270.");
    	else System.out.println("You are speeding and your fine is $100.");
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