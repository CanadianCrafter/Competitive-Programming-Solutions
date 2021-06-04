import java.util.*;
import java.io.*;
public class Grid1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int H = readInt();
    	int W = readInt();
    	int arr[][]=new int[H+1][W+1];
    	for(int i =0;i<H;i++) {
    		String input = readLine();
    		for(int j=0;j<W;j++) {
    			if(input.charAt(j)=='.') arr[i+1][j+1]=-11;
    			else arr[i+1][j+1]=0;
    		}
    	}
    	arr[1][1]=1;
    	for(int i =1;i<H+1;i++) {
    		for(int j=1;j<W+1;j++) {
    			if(i==1&&j==1)continue;
    			if(arr[i][j]==0)continue;
    			arr[i][j]=(int) ((arr[i-1][j]+arr[i][j-1])%(Math.pow(10, 9)+7));
    		}
    	}
//    	for(int a[]:arr) {
//    		for(int n :a) {
//    			System.out.print(n+" ");
//    		}
//    		System.out.println();
//    	}
    	System.out.println(arr[H][W]);
    	
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