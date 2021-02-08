import java.util.*;
import java.io.*;
public class USACO21JANSP3SpacedOut {
	//not sub
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	int arr[][] = new int [N][N];
    	int arr2[][] = new int [N][N];
    	for(int i =0;i<N;i++) {
    		for(int j =0;j<N;j++) {
    			arr[i][j]=readInt();
    			arr2[j][i]=arr[i][j];
    		}
    	}
    	int ans1=0;
    	int ans2=0;
    	for(int i =0;i<N;i++) {
    		int odd1=0;
    		int odd2=0;
    		int even1=0;
    		int even2=0;
    		for(int j =0;j<N;j++) {
    			if(j%2==0) {
    				even1+=arr[i][j];
    				even2+=arr2[i][j];
    			}
    			else {
    				odd1+=arr[i][j];
    				odd2+=arr2[i][j];
    			}
    			
    		}
    		ans1+=Math.max(even1, odd1);
			ans2+=Math.max(even2, odd2);
    	}
    	System.out.println(Math.max(ans1, ans2));
    	
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