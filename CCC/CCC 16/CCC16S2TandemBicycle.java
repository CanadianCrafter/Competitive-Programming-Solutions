import java.util.*;
import java.io.*;
public class CCC16S2TandemBicycle {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int q = readInt();
    	int N = readInt();
    	if(q==1) {
        	int arrD[]=new int[N];
        	int arrP[] = new int [N];
        	int sum = 0;
        	for(int i =0;i<N;i++) arrD[i]=readInt();
        	for(int i =0;i<N;i++) arrP[i]=readInt();
        	Arrays.sort(arrD);
        	Arrays.sort(arrP);
        	
        	for(int i =0;i<N;i++) {
        		sum+= Math.max(arrD[i], arrP[i]);
        	}
        	System.out.println(sum);
    		
    	}
    	
    	else if(q==2) {
    		int arr[] = new int [2*N];
    		for(int i =0;i<2*N;i++) arr[i]=readInt();
    		Arrays.sort(arr);
    		int sum = 0;
    		for(int i =N;i<2*N;i++) sum+=arr[i];
    		System.out.println(sum);
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
