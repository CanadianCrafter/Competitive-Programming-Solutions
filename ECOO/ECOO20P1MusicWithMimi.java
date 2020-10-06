import java.util.*;
import java.io.*;
public class ECOO20P1MusicWithMimi {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int n = readInt();
    	String a[] = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
    	for(int i=0;i<n;i++) {
    		String b[] = new String[4];
    		for(int k=0;k<4;k++) {
    			b[k]=next();
    		}
    		int num =0;
    		for(int k=0;k<12;k++) {
    			if(a[k].equals(b[0])) {
    				num =k;
    				break;
    			}
    		}
    		if(b[1].equals(a[(num+4)%12]) && b[2].equals(a[(num+7)%12]) && b[3].equals(a[(num+10)%12])    ) {
    			System.out.println("root");
    		}
    		else if(b[1].equals(a[(num+3)%12]) && b[2].equals(a[(num+6)%12]) && b[3].equals(a[(num+8)%12])    ) {
    			System.out.println("first");
    		}
    		else if(b[1].equals(a[(num+3)%12]) && b[2].equals(a[(num+5)%12]) && b[3].equals(a[(num+9)%12])    ) {
    			System.out.println("second");
    		}
    		else if(b[1].equals(a[(num+2)%12]) && b[2].equals(a[(num+6)%12]) && b[3].equals(a[(num+9)%12])    ) {
    			System.out.println("third");
    		}
    		else {
    			System.out.println("invalid");
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