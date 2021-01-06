import java.util.*;
import java.io.*;
public class CCC10S3Firehose {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int H,K;
    static int[] addresses;
    static int max = 1000000;
    public static void main(String[] args) throws IOException {
    	H = readInt();
    	addresses = new int[H];
    	for(int i =0;i<H;i++)
    		addresses[i]=readInt();
    	Arrays.sort(addresses);
    	K = readInt();
    	int low = 0;
    	int high = max;
    	int ans = 0;
    	while(low <= high){
			int mid = (low + high)/2;
			if(check(mid) <= K){
				ans = mid; 
				high = mid-1;
			}
			else 
				low = mid+1;
		}
		System.out.println(ans);
    		
    }
    private static int check(int radius) {
    	int ret = H;
		int dis=2*radius;
		//loop through the possible starting points for the first house
		//loop through the houses to the right of the first house and is close enough that
		//a firehose in the middle can reach both houses
		for(int st =0;st<addresses.length &&addresses[st]<=addresses[0]+dis;st++) {
			int cnt=1;
			int lst = addresses[st];
			//loops through the remaining houses based on the start
			for(int nxt=st+1;nxt<addresses.length&&addresses[nxt]+dis<addresses[st]+max;nxt++) {
				//if two houses are too far apart for them to share a single firehose, you need another one
				if(addresses[nxt]>lst) {
					lst = addresses[nxt]+dis;
					cnt++;
				}
			}
			//minimum needed
			ret = Math.min(ret, cnt);
		}		
		return ret;
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