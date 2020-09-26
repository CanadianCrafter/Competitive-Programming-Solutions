import java.util.*;
import java.io.*;
public class CCC15J4WaitTime {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int M = readInt();
    	int wait[] = new int[101];
    	int recieve[] = new int [101];
    	int time = 0;
    	
    	Arrays.fill(recieve, -1);
    	
    	for(int i = 0;i<M;i++) {
    		char ch = readCharacter();
    		int x = readInt();
    		
    		if(ch =='R') {
    			recieve[x]=time;
    			time++;
    		}
    		else if (ch=='S') {
    			wait[x]+=time-recieve[x];
    			recieve[x]=-1;
    			time++;
    		}
    		else if (ch=='W') {
    			time+=x-1;
    		}
    		
    		
    	}
    	for(int i = 0;i<101;i++) {
    		if(recieve[i]!=-1) System.out.println(i+" -1");
    		else if(wait[i]>0) System.out.println(i+" "+wait[i]);
    	}
    	
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