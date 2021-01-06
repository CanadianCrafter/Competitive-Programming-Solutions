import java.util.*;
import java.io.*;
public class CCC15S2Jerseys {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int J = readInt();
    	int A  = readInt();
    	int size[] = new int [J+1];
    	for(int i =1;i<J+1;i++) {
    		String str = next();
    		size[i] = getSize(str);
    		
    	}
    	
    	int count = 0;
    	for(int i =0;i<A;i++) {
    		int playerSize = getSize(next());
    		int num = readInt();
    		if(size[num]>=playerSize) {
    			count++;
    			size[num]=-1;
    		}
    		
    	}
    	System.out.println(count);
    	
    }
    private static int getSize(String str) {
    	if(str.equals("S"))return 0;
		else if(str.equals("M"))return 1;
		else if(str.equals("L"))return 2;
    	return -1;
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