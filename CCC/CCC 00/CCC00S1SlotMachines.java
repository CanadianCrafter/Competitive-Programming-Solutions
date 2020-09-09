import java.util.*;
import java.io.*;
public class CCC00S1SlotMachines {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int bal =readInt();
    	int a = readInt();
    	int b = readInt();
    	int c = readInt();
    	int total=bal;
    	
    	int wina =0, winb = 0, winc = 0; 
    	do {
	    	int divBal = bal/3;
	    	a += divBal;b += divBal;c += divBal;
	    	bal %=3;
	    	if(bal==1) {
	    		a++;
	    	}
	    	else if(bal==2) {
	    		a++;
	    		b++;
	    	}
	    	bal=0;
	    	bal+= 30*(a/35)+60*(b/100)+9*(c/10);
	    	total+=bal;
	    	a %=35;
	    	b %=100;
	    	c%=10;
    	
    	}while(bal!=0);
    	
    	System.out.printf("Martha plays %d times before going broke.",total);
    	
    	
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