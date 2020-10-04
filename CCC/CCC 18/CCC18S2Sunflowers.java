import java.util.*;
import java.io.*;
public class CCC18S2Sunflowers {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int arr[][];
    static int newArr[][];
    static int N;
    public static void main(String[] args) throws IOException {
    	N = readInt();
    	arr = new int [N][N];
    	newArr = new int [N][N];
    	for(int i =0;i<N;i++) {
    		for(int j =0;j<N;j++) {
    			arr[i][j]=readInt();
    		}
    	}
    	
    	
    	boolean horizontal = true;
    	boolean vertical = true;
    	if(arr[0][0]<arr[0][1]) horizontal=true;
    	else horizontal = false;
    	
    	if(arr[0][0]<arr[1][0]) vertical=true;
    	else vertical = false;
    	if(horizontal&&vertical) output(true);
    	
    	if(!horizontal&&vertical) rotate(3);
    	else if(!horizontal&&!vertical) rotate(2);
    	else if(horizontal&&!vertical) rotate(1);
    }
    
    
    private static void rotate(int i) {
		for(int j = 0;j<i;j++) {
			for(int k =0;k<N;k++) {
				for(int n =0;n<N;n++) {
					newArr[k][n] = arr[N-1-n][k];
				}
			}
			for(int k =0;k<N;k++) {
				for(int n =0;n<N;n++) {
					arr[k][n] = newArr[k][n];
				}
			}
			
		}
		output(false);
		
	}


	private static void output(boolean b) {
		if(b) {
			for(int[] line : arr) {
				for(int num : line) {
					System.out.print(num + " ");
				}
				System.out.println();
			}
		}
		else {
			for(int[] line : newArr) {
				for(int num : line) {
					System.out.print(num + " ");
				}
				System.out.println();
			}
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