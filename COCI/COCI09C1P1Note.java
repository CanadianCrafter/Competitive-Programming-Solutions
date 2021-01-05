import java.util.*;
import java.io.*;
public class COCI09C1P1Note {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int arr[] = new int [8];
    	for(int i =0;i<8;i++) {
    		arr[i]=readInt();
    	}
    	
    	boolean flag=false;
    	for(int i =1;i<8;i++) {
    		if(arr[i-1]<arr[i]) {
    			flag = true;
    		}
    	}
    	if(!flag) {
    		System.out.println("descending");
    		return;
    	}
    	
    	flag=false;
    	for(int i =1;i<8;i++) {
    		if(arr[i-1]>arr[i]) {
    			flag = true;
    		}
    	}
    	if(!flag) {
    		System.out.println("ascending");
    		return;
    	}
    	System.out.println("mixed");
    	
    	
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