import java.util.*;
import java.io.*;
public class DMOPC13C3P2PhoneMicrowave {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int S = readInt();
    	int days[] = {0, 31, 28, 31, 30,31,30,31,31,30,31,30,31};
    	String str[] = readLine().split("[/: ]");
    	int year = Integer.parseInt(str[0]);
    	int month = Integer.parseInt(str[1]);
    	int day = Integer.parseInt(str[2]);
    	int hour = Integer.parseInt(str[3]);
    	int minute = Integer.parseInt(str[4]);
    	int second = Integer.parseInt(str[5]);
    	
    	hour-=S;
    	while(hour<0) {//year<0||month<0||day<0||hour<0||minute<0||second<0
			hour+=24;
			day--;
    		
    		if(day==0) {
    			
    			month--;
    		
				if(month==0) {
					month=12;
					year--;
				}
				day+=days[month];
    		}
    	}
    	System.out.printf("%d/%02d/%02d %02d:%02d:%02d",year, month, day, hour, minute, second);
    	
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