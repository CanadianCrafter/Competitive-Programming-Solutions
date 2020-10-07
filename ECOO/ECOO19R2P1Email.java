import java.util.*;
import java.io.*;
public class ECOO19R2P1Email {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static HashSet <String> set;
    public static void main(String[] args) throws IOException {
    	for(int i=0;i<10;i++) {
    		int N = readInt();
    		set = new HashSet<String>(); 
    		int cnt =0;
    		for(int j=0;j<N;j++) {
    			check(next().toLowerCase());
    			
      		}
    		System.out.println(set.size());
    	}
//    	check(next().toLowerCase());
    }
    private static void check(String str) {
    	boolean atFlag = false;
    	boolean plusFlag = false;
    	String newStr = "";
    	for(int i =0;i<str.length();i++) {
    		char ch = str.charAt(i);
    		if(ch=='@') {
    			atFlag=true;
    			plusFlag = false;
    			newStr+=ch;
    			continue;
    		}
    		else if(ch=='+'&&!atFlag) {
    			plusFlag=true;
    			continue;
    		}
    		if(plusFlag) continue;
    		if(ch=='.'&&!atFlag) continue;
    		newStr+=ch;
    	}
    	set.add(newStr);
    	
    	
//    	for(int i =0;i<ls.size();i++) {
//    		
//    	}
//    	System.out.println(newStr);
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