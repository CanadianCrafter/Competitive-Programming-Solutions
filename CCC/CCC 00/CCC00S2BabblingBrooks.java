import java.util.*;
import java.io.*;
public class CCC00S2BabblingBrooks {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int n = readInt();
    	ArrayList <Double> list = new ArrayList<Double>();
    	for(int i = 0;i<n;i++) list.add(readDouble());
    	int input = 0;
    	do {
    		input = readInt();
    		if(input == 99) {
    			int stream = readInt()-1;
    			double percent = (double) readInt()/100;
    			double pastStream = list.get(stream);
    			list.set(stream, pastStream*percent);
    			list.add(stream+1,pastStream*(1-percent));
    		}
    		else if (input ==88) {
    			int stream = readInt()-1;
    			list.set(stream+1, list.get(stream)+list.get(stream+1));
    			list.remove(stream);		
    		}
    		
    	}while(input!=77);
    	for(int i =0;i<list.size();i++) {
    		System.out.printf("%.0f ",list.get(i));
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