import java.util.*;
import java.io.*;
public class CCC14S3TheGenevaConfection {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static Stack<Integer> top;
    static Stack<Integer> branch;
    public static void main(String[] args) throws IOException {
    	int T = readInt();
    	for(int i =0;i<T;i++) {
    		int N = readInt();
    		top = new Stack<Integer>();
    		branch = new Stack<Integer>();
    		for(int j = 0;j<N;j++) top.push(readInt());
    		check();
    	}
    }
    private static void check() {
		int nextNum = 1;
		do {
			if(!top.empty()&&top.peek()==nextNum) {
				top.pop();
				nextNum++;
			}
			else if (!branch.empty()&&branch.peek()==nextNum) {
				branch.pop();
				nextNum++;
			}
			else if(!top.empty()){
				branch.push(top.pop());
			}
			else if(top.empty()) {
				System.out.println("N");
				return;
			}
		}while(!top.isEmpty()||!branch.isEmpty());
		System.out.println("Y");
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