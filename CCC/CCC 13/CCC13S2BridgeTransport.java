import java.util.*;
import java.io.*;
public class CCC13S2BridgeTransport {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int W = readInt();
    	int N = readInt();
    	Queue<Integer> que = new LinkedList<Integer>();
    	int sum = 0;
    	int car = 0;
    	do {
    		int num = readInt();
    		sum+=num;
    		que.add(num);
    		if(que.size()>4)sum-=que.remove();
    		car++;
    	}while(sum<=W&&car<N);
    	if(car==N&&sum<=W)System.out.println(car);
    	else System.out.println(car-1);
    	
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