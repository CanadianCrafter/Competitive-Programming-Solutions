import java.util.*;
import java.io.*;
public class USACO21JANBP2EvenMoreOddPhotos {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	int arr[] = new int[2];
    	for(int i =0;i<N;i++)
    		arr[readInt()%2]++;
    	int index=0;
    	int ans=0;
    	while(true) {
    		if(index%2==0) {
    			if(arr[0]>0) {
    				arr[0]--;
    				ans++;
    			}
    			else if(arr[1]>1) {
    				arr[1]-=2;
    				ans++;
    			}
    			else break;
    		}
    		else {
    			if(arr[1]==2&&arr[0]==0)break;
    			if(arr[1]>0) {
    				arr[1]--;
    				ans++;
    			}
    			else break;
    		}
//    		System.out.println(Arrays.toString(arr));
    		index++;
    	}
    	System.out.println(ans);
    	
    	
    }
    static String next () throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static int readInt () throws IOException {
        return Integer.parseInt(next());
    }
    static String readLine () throws IOException {
        return br.readLine().trim();
    }
}