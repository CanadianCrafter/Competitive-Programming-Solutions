import java.util.*;
import java.io.*;
public class LargestPermuation {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	int arr[] = new int [N+1];
    	int pos[] = new int [N+1];
    	int K = readInt();
    	for(int i =0;i<N;i++) {
    		arr[i] = readInt();
    		pos[arr[i]] = i;
    	}
    	int temp=0;
//    	int max = 0;
    	for(int i =0;i<N&&K>0;i++) {
    		if(arr[i]<N-i) {
    			
    			temp = arr[i];
        		arr[i] = N-i;
        		arr[pos[N-i]]=temp;
        		pos[temp]=pos[N-i];
        		pos[N-i]=i;
    			K--;
    			
    		}
    		
//    		for(int j = i;j<N;j++) {
//    			if(arr[j]>max)max = arr[j];
//    		}
//    		if(max==arr[i]) {
//    			i--;
//    			continue;
//    		}
//    		temp = arr[i];
//    		arr[i] = max;
//    		arr[pos[max]]=temp;
//    		pos[temp]=pos[max];
//    		pos[max]=i;
    		
    	}
    	for(int i = 0;i<N;i++) {
    		System.out.print(arr[i] + " ");
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