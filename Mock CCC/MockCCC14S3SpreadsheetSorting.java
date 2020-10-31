import java.util.*;
import java.io.*;
public class MockCCC14S3SpreadsheetSorting {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int R = readInt(), C = readInt();
    	int arr[][]=new int [R][C];
    	Integer id[] = new Integer [R];
    	for(int i =0;i<R;i++) {
    		id[i]=i;
    		for(int j =0;j<C;j++)arr[i][j]=readInt();
    	}
    	int N = readInt();
    	for(int i =0;i<N;i++) {
    		int col = readInt()-1;
    		//rearranges the id, by sorting a specific column
    		Arrays.sort(id, new Comparator<Integer>(){
        		public int compare(Integer o1, Integer o2) {
        			return Integer.compare(arr[o1][col], arr[o2][col]);
        		}
        	});
    	}
    	for(int i =0;i<R;i++) {
    		for(int j =0;j<C;j++) {
    			System.out.print(arr[id[i]][j]+" ");
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