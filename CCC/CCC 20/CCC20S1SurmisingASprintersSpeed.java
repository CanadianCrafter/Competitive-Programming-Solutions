import java.util.*;
import java.io.*;
public class CCC20S1SurmisingASprintersSpeed {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int n = readInt();
    	int a[] = new int [n];
    	double maxSpeed =0;
    	TreeMap<Integer, Integer> tmap = new TreeMap<Integer, Integer>();
    	for(int i = 0; i<n;i++) {
    		int t = readInt();
    		a[i] = t;
    		int x = readInt();
    		tmap.put(t,x);
    	}
    	Arrays.sort(a);
    	for(int i = 0; i<n-1;i++) {
    		double dist = Math.abs(tmap.get(a[i])-tmap.get(a[i+1]));
    		double time = a[i+1]-a[i];
    		double speed = dist/time;
    		if(speed>maxSpeed) maxSpeed = speed;
    	}
    	System.out.println(maxSpeed);
    	
    	
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