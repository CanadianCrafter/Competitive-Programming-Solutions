import java.util.*;
import java.io.*;
public class CCC16J4ArrivalTime {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	String str[] = readLine().split("[ :]");
    	int time = Integer.parseInt(str[0])*60+Integer.parseInt(str[1]);
    	for(int i =0;i<120;i++) {
    		if(time>=420&&time<600) time+=2;
    		else if(time>=900&&time<1140) time+=2;
    		else time++;
    	}
    	System.out.printf("%02d:%02d",(time%1440)/60,time%60);
    	
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