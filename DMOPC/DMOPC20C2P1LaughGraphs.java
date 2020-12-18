import java.util.*;
import java.io.*;
public class DMOPC20C2P1LaughGraphs {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	char ch[][] = new char[2*N+2][N];
    	for(int i =0;i<2*N+2;i++)
    		Arrays.fill(ch[i],'.');
    	int r = N;
    	char in[] =readLine().toCharArray();
    	for(int i =0;i<N;i++) {
    		if(in[i] == '^') {
    			ch[r][i] = '/';
    			r--;
    		}
    		else if(in[i] == 'v') {
    			r++;
    			ch[r][i] = '\\';
    		}
    		else {
    			ch[r][i] = '_';
    		}
    	}
    	
    	
    	for(int i =0;i<2*N+2;i++) {
    		String str="";
    		boolean flag = false;
    		for(int j =0;j<N;j++) {
    			str+=ch[i][j];
    			if(ch[i][j]!='.') flag=true;
    		}
    		if(flag) System.out.println(str);
    		
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