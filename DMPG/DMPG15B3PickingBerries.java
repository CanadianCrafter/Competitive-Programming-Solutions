import java.util.*;
import java.io.*;
public class DMPG15B3PickingBerries {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int W = readInt();
    	int H = readInt();
    	int berryCount = 0;
    	for(int i =0;i<H;i++) {
    		String str = readLine();
    		String newStr = "";
    		for(int j = 0;j<W;j++) {
    			char ch = str.charAt(j);
    			if(ch=='*') newStr+=" ";
    			else if (ch=='o') {
    				newStr+=" ";
    				berryCount++;
    			}
    			else newStr+=ch;
    		}
    		System.out.println(newStr);
    	}
    	for(int i = 0;i<berryCount;i++)System.out.print("o");
    	
    }
    static String next () throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
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
        return br.readLine();
    }
}