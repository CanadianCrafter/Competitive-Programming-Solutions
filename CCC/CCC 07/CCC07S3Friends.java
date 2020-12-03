import java.util.*;
import java.io.*;
public class CCC07S3Friends {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int map[] = new int [10000];
    	int N = readInt();
    	for(int i =0;i<N;i++)map[readInt()]=readInt();
    	
    	while(true) {
    		int x = readInt();
    		int y = readInt();
    		if(x==0&&y==0)break;
    		boolean vis[] = new boolean[10000];
    		int dis=0;
    		while(!vis[x]&&x!=y) {
    			vis[x]=true;
    			x=map[x];
    			dis++;
    		}
    		if(x==y) {
    			System.out.printf("Yes %d\n",dis-1);
    		}
    		else System.out.println("No");
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