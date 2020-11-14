import java.util.*;
import java.io.*;
public class CCC07J3DealOrNoDealCalculator {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int prize[] = {100,500,1000,5000,10000,25000,50000,100000,500000,1000000};
    	double sum = 100+500+1000+5000+10000+25000+50000+100000+500000+1000000;
    	int N = readInt();
    	for(int i =0;i<N;i++) {
    		sum-=prize[readInt()-1];
    	}
    	int d = readInt();
    	sum/=(double)(10-N);
    	if(sum<d)System.out.println("deal");
    	else System.out.println("no deal");
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