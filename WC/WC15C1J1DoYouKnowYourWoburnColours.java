import java.util.*;
import java.io.*;
public class WC15C1J1DoYouKnowYourWoburnColours {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	boolean a[] = new boolean[3];
    	for(int i =0;i<2;i++) {
    		String str = next();
    		if(str.equals("RED"))a[0]=true;
    		else if(str.equals("BLUE"))a[1]=true;
    		else if(str.equals("WHITE"))a[2]=true;
    	}
    	
    	if(!a[0])System.out.println("RED");
    	else if(!a[1])System.out.println("BLUE");
    	else if(!a[2])System.out.println("WHITE");
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