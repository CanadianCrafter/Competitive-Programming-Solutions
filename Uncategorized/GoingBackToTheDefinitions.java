import java.util.*;
import java.io.*;
public class GoingBackToTheDefinitions {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
    	int N =readInt();
    	String arr[] =  new String[N];
    	for(int i =0;i<N;i++) {
    		arr[i]=next();
    	}
    	Arrays.sort(arr, new Compare());
    	String ans = "";
    	for(int i =0;i<arr.length;i++) System.out.print(arr[i]);
    	
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
class Compare implements Comparator<String>{
	public int compare(String o1, String o2) {
		return (o2+o1).compareTo(o1+o2);
	}
	
	
	
}