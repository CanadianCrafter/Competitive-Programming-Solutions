import java.util.*;
import java.io.*;
public class DMOPC19C1P2GoodWriting {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static String pre = "Good writing is good ";
    static String mid = " writing is good ";
    static String suf = " is good writing.";
    static String base = "Good writing is good writing is good writing.";
    static long len[] = new long[31];
    public static void main(String[] args) throws IOException {
    	len[0]=base.length();
    	for(int i =1;i<=30;i++) {
    		len[i]=pre.length()+mid.length()+suf.length()+2*len[i-1];
    	}
    	int q = readInt();
    	for(int i =1;i<=q;i++) {
    		int lvl = readInt();
    		int idx = readInt();
    		if(idx>=len[lvl])System.out.println(".");
    		else System.out.println(fun(lvl,idx-1));
    		
    	}
    }
    private static char fun(int lvl, int idx) {
    	if(lvl==0) 	return base.charAt(idx);
    	int sz=pre.length();
    	if(idx<sz)return pre.charAt(idx);
    	if(idx<sz+len[lvl-1])return fun(lvl-1,idx-sz);
    	sz+=len[lvl-1];
    	if(idx<sz+mid.length())return mid.charAt(idx-sz);
    	sz+=mid.length();
    	if(idx<sz+len[lvl-1]) return fun(lvl-1,idx-sz);
    	sz+=len[lvl-1];
    	return suf.charAt(idx-sz);
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