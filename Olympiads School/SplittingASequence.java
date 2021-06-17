import java.util.*;
import java.io.*;
public class SplittingASequence {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int N, M;
    static int arr[];
    public static void main(String[] args) throws IOException {
    	N = readInt();
    	M = readInt();
    	arr = new int [N+1];
    	long low = 0;
    	long high = 0;
    	long ans=0;
    	for(int i =1;i<=N;i++) {
    		arr[i]=readInt();
    		low=Math.max(low, arr[i]);
    		high+=arr[i];
    	}
    	while(low<=high) {
    		long mid = (low+high)/2;
    		if(check(mid)) {
    			ans=mid;
    			high=mid-1;
    		}
    		else {
    			low=mid+1;
    		}
    	}
    	System.out.println(ans);
    }
    private static boolean check(long x) {
		int cnt = 1;
		long sum =0;
		for(int i =1;i<=N;i++) {
			if(sum+arr[i]<=x)
				sum+=arr[i];
			else {
				cnt++;
				sum=arr[i];
			}
		}
		return cnt <= M;
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