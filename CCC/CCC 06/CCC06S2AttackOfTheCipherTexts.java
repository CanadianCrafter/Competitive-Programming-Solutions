import java.util.*;
import java.io.*;
public class CCC06S2AttackOfTheCipherTexts {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static Map<Character, Character> map;
    public static void main(String[] args) throws IOException {
    	map = new HashMap();
    	String str1 = readLine();
    	String str2 = readLine();
    	for(int i = 0; i<str1.length();i++) {
    		map.put(str2.charAt(i), str1.charAt(i));
       	}
    	String str3 = readLine();
    	String newStr = "";
    	for(int i =0;i<str3.length();i++) {
    		if(map.get(str3.charAt(i))==null) newStr += '.';
    		else newStr += map.get(str3.charAt(i));
    	}
    	System.out.println(newStr);
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