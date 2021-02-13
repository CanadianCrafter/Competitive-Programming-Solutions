import java.util.*;
import java.io.*;
public class MWC15C1P3Dolls {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int arr[] = new int [101];
    	int N = readInt();
    	for(int i =0;i<N;i++)
    		arr[readInt()]++;
    	int min=Integer.MAX_VALUE;
    	int minId=0;
    	for(int i =0;i<101;i++) {
    		if(arr[i]!=0&&arr[i]<min) {
    			min=arr[i];
    			minId=i;
    		}
    	}
    	
    	int max=Integer.MIN_VALUE;
    	int maxId=0;
    	for(int i =100;i>=0;i--) {
    		if(arr[i]!=0&&arr[i]>max) {
    			max=arr[i];
    			maxId=i;
    		}
    	}
    	System.out.println(Math.abs(minId-maxId));
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