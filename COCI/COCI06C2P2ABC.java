import java.util.*;
import java.io.*;
public class COCI06C2P2ABC {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int arr[] = new int[3];
    	for(int i =0;i<3;i++)
    		arr[i]=readInt();
    	Arrays.sort(arr);
    	char ch[] = readLine().toCharArray();
    	int chN[] = new int[3];
    	for(int i =0;i<3;i++)
    		chN[i]=ch[i]-'A';
    	for(int i =0;i<3;i++)
    		System.out.print(arr[chN[i]]+" ");
    	
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