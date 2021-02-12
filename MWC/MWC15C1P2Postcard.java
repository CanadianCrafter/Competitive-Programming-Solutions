import java.util.*;
import java.io.*;
public class MWC15C1P2Postcard {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	int M = readInt();
    	char arr[][]=new char [N][M];
    	boolean flag=false;
    	for(int i =0;i<N;i++) {
    		for(int j =0;j<M;j++) {
    			arr[i][j]=readCharacter();
    			if(arr[i][j]=='*')flag=true;
    		}
    	}
    	if(!flag)return;
    	int r1=0;
    	int c1=0;
    	int r2=0;
    	int c2=0;
    	loop:
    	for(int i =0;i<N;i++) {
    		for(int j =0;j<M;j++) {
    			if(arr[i][j]=='*') {
    				r1=i;
    				break loop;
    			}
    		}
    	}
    	loop1:
    	for(int i =N-1;i>=0;i--) {
    		for(int j =0;j<M;j++) {
    			if(arr[i][j]=='*') {
    				r2=i;
    				break loop1;
    			}
    		}
    	}
    	loop2:
    	for(int i =0;i<M;i++) {
    		for(int j =0;j<N;j++) {
    			if(arr[j][i]=='*') {
    				c1=i;
    				break loop2;
    			}
    		}
    	}
    	loop3:
    	for(int i =M-1;i>=0;i--) {
    		for(int j =0;j<N;j++) {
    			if(arr[j][i]=='*') {
    				c2=i;
    				break loop3;
    			}
    		}
    	}
    	
    	for(int i=r1;i<=r2;i++) {
    		for(int j =c1;j<=c2;j++) {
    			System.out.print(arr[i][j]+" ");
    		}
    		System.out.println();
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