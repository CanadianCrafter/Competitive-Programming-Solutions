import java.util.*;
import java.io.*;
public class BubbleSort {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	String in[] = readLine().split("[ ]");
    	int arr[] = new int [N];
    	for(int i =0;i<N;i++) arr[i]=Integer.valueOf(in[i]);
    	Boolean sort;
		for(int j=0;j<N;j++)System.out.print(arr[j]+" ");
		System.out.println();

    	do{
    		sort =true;
    		for(int i =0;i<N-1;i++) {
    			int tmp;
    			if(arr[i]<=arr[i+1]) {
    			}
    			else {
    				tmp = arr[i+1];
    				arr[i+1]=arr[i];
    				arr[i]=tmp;
    				sort=false;
    				for(int j=0;j<N;j++)System.out.print(arr[j]+" ");
    				System.out.println();
    			}
    			
    		}
    	}while(!sort);
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