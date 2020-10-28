import java.util.*;
import java.io.*;
public class DWITE09R4P3MovingAtTheSameTime {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	for(int i =0;i<5;i++) {
    		String initial = readLine();
    		System.out.println(initial);
    		ArrayList<Integer> num = new ArrayList<Integer>();
    		ArrayList<Integer> pos= new ArrayList<Integer>();
        	for(int j=0;j<initial.length();j++) {
        		if(initial.charAt(j)!='.') {
        			num.add(Character.getNumericValue(initial.charAt(j)));
        			pos.add(j);
        		}
        	}
    		for(int j =0;j<4;j++) {
    			int arr[] = new int [initial.length()];
    			Arrays.fill(arr, -1);
    			for(int n =0;n<num.size();n++) {
    				int newPos = num.get(n)+pos.get(n);
    				if(newPos<arr.length) {
    					if(arr[newPos]==-1)arr[newPos]=num.get(n);
    					else arr[newPos]+=num.get(n);
    				}
    				pos.set(n, newPos);
    			}
    			for(int n=0;n<arr.length;n++) {
    				if(arr[n]==-1)System.out.print(".");
    				else System.out.print(arr[n]);
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