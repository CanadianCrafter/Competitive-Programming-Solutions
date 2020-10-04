import java.util.*;
import java.io.*;
public class CCC18S1VoronoiVillages {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	long inputArr[] = new long[N];
    	long arr[] = new long [N-2];
    	
    	for(int i =0;i<N;i++) {
    		inputArr[i]=readLong();
    	}
    	Arrays.sort(inputArr);
    	for(int i =0;i<N-2;i++) {
    		arr[i] =inputArr[i+2]-inputArr[i];
    	}
    	long min = Long.MAX_VALUE;
    	for(int i =0;i<N-2;i++) {
    		if(arr[i]<min)min=arr[i];
    	}
    	double ans = ((double) min)/2;
    	System.out.printf("%.1f",ans);
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