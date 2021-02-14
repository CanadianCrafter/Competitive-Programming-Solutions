import java.util.*;
import java.io.*;
public class MWC15C1P5LoveGuru {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	String a = readLine().toLowerCase();
    	String b = readLine().toLowerCase();
    	
    	int valueA=0;
    	int valueB=0;
    	for(int i =0;i<a.length();i++) {
    		valueA+=pow(a.charAt(i)-'a'+1,i+1);
    	}
    	for(int i =0;i<b.length();i++) {
    		valueB+=pow(b.charAt(i)-'a'+1,i+1);
    	}
    	valueA%=10; valueB%=10;
    	if(valueA==0)valueA=10;
    	if(valueB==0)valueB=10;
    	System.out.println(valueA+valueB);
    	
    }
    private static int pow(int base, int exp) {
		if(exp==0)return 1;
		int tmp = pow(base, exp/2);
		tmp=tmp*tmp%10;
		if(exp%2==0)return tmp;
		return tmp*base%10;
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