import java.util.*;
import java.io.*;
public class CCC05S1SnowCalls {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static String newStr;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	for(int i=0; i<N;i++) {
    		String str = readLine();
    		str = str.toUpperCase();
    		newStr = "";
    		int count = 0;
    		int check = 0;
    		for(int k =0;k<str.length();k++) {
    			if (count==3&&check<1) {
    				newStr += "-";
    				check++;
    			}
    			else if (count==6&&check<2) {
    				newStr += "-";
    				check++;
    			}
    			char ch = str.charAt(k);
    			if(ch!='-'&&count<10) {
    				if((int)ch>=65) {
        				newStr += convert(ch);
        			}
        			else {
        				newStr+=ch;
        			}
        			count++;
    			}
    			
    		}
    		System.out.println(newStr);
    	}
    	
    }
    private static String convert(char ch) {
		if((int)ch>=65&&(int)ch<=67) {
			return "2";
		}
		if((int)ch>=68&&(int)ch<=70) {
			return "3";
		}
		if((int)ch>=71&&(int)ch<=73) {
			return "4";
		}
		if((int)ch>=74&&(int)ch<=76) {
			return "5";
		}
		if((int)ch>=77&&(int)ch<=79) {
			return "6";
		}
		if((int)ch>=80&&(int)ch<=83) {
			return "7";
		}
		if((int)ch>=84&&(int)ch<=86) {
			return "8";
		}
		if((int)ch>=87&&(int)ch<=90) {
			return "9";
		}
		return null;
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