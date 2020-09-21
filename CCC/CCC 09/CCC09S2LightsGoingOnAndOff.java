import java.util.*;
import java.io.*;
public class CCC09S2LightsGoingOnAndOff {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int R = readInt();
    	int L = readInt();
    	String row[] = new String[R];
    	HashSet<String> set[] = new HashSet[R];
    	for(int i=0;i<R;i++) {
    		row[i]="";
    		set[i]=new HashSet();
    		for(int j=0;j<L;j++) {
    			row[i]+=readInt();
    		}
    		set[i].add(row[i]);
    	}
    	Iterator<String> it;
    	for(int i =1;i<R;i++) {
    		 it = set[i-1].iterator();
    	     while(it.hasNext()){
    	    	 set[i].add(compare(row[i],it.next()));
    	     }
    	}
    	System.out.println(set[R-1].size());
    
    }
    static String compare(String a, String b) {
    	String str="";
    	for(int i =0;i<a.length();i++){
    		if(a.charAt(i)==b.charAt(i))str+=0;
    		else str+=1;
    	}
    	return str;
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