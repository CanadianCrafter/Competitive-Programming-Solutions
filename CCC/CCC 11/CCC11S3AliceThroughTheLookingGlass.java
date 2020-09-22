import java.util.*;
import java.io.*;
public class CCC11S3AliceThroughTheLookingGlass {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int T = readInt();
    	for(int i =0;i<T;i++) {
    		int m = readInt();
    		int x = readInt();
    		int y = readInt();
    		if(fun(m,x,y))System.out.println("crystal");
    		else System.out.println("empty");
    		
    	}
    }
    private static boolean fun(int m, int x, int y) {
    	if(m==1) {
    		if(y==0) {
    			if(x==1||x==2||x==3) return true;
    		}
    		else if(y==1&&x==2) return true;
    		else return false;
    	}
    	int div=(int)Math.pow(5, m-1);
    	int x2 = x/div;
    	int y2 = y/div;
    	if(y2==0&&x2>=1&&x2<=3)return true;
		else if(y2==1&&x2==2) return true;
		else if((y2==1&&x2==1)||(y2==2&&x2==2)||(y2==1&&x2==3)) {
			return fun(m-1,x%div,y%div);
		}
    	return false;
		
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