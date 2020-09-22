import java.util.*;
import java.io.*;
public class CCC02S1TheStudentsCouncilBreakfast {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int p = readInt(),g=readInt(),r=readInt(),o=readInt();
    	int total = readInt();
    	int cnt=0;
    	int min=Integer.MAX_VALUE;
    	for(int i =0;i<=total/p;i++) {
    		for(int j=0;j<=(total-i*p)/g;j++) {
    			for(int k=0;k<=(total-i*p-g*j)/r;k++) {
        			if((total-i*p-g*j-k*r)%o==0) {
        				cnt++;
        				int l = (total-i*p-g*j-k*r)/o;
        				min=Math.min(i+j+k+l,min);
        				System.out.printf("# of PINK is %d # of GREEN is %d # of RED is %d # of ORANGE is %d\n",i,j,k,l);
        			}
        		}
    		}
    	}
    	System.out.printf("Total combinations is %d.\n",cnt);
    	System.out.printf("Minimum number of tickets to print is %d.\n",min);
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