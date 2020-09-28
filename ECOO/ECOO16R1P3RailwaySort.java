import java.util.*;
import java.io.*;
public class ECOO16R1P3RailwaySort {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	for(int k=0;k<10;k++) {
    		int N = readInt();
    		ArrayList<Integer> list = new ArrayList<Integer>();
    		for(int i =0;i<N;i++)list.add(readInt());
    		
    		int ans=0;
    		for(int i =N;i>1;i--) {
    			int curIndex = list.indexOf(i);
    			int prevIndex = list.indexOf(i-1);
    			if(curIndex<prevIndex) {
    				//move to front
    				ans+=prevIndex;
    				list.remove(prevIndex);
    				list.add(0,i-1);
    			}
    		}
    		System.out.println(ans);
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