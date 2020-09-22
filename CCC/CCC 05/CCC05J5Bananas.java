import java.util.*;
import java.io.*;
public class CCC05J5Bananas {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	String str="";
    	do {
    		str = readLine();
    		if(str.equals("X"))break;
    		if(monkeyWord(str))System.out.println("YES");
    		else System.out.println("NO");
    		
    	}while(!str.equals("X"));
    }
    private static boolean monkeyWord(String str) {
		if(AWord(str))return true;
		else {
			for(int i =0;i<str.length();i++) {
				if(str.charAt(i)=='N') {
					if(AWord(str.substring(0,i))&&monkeyWord(str.substring(i+1))){
						return true;
					}
				}
			}
//			String arr[] = str.split("N");
//			boolean flag = true;
//			for(int i =0;i<arr.length;i++) {
//				if(!AWord(arr[i]))flag=false;
//			}
//			if(flag)return true;
			return false;
		}
		
	}
	private static boolean AWord(String str) {
		if(str.length()==0)return false;
		if(str.equals("A"))return true;
		else if(str.length()>=3&&str.charAt(0)=='B'&&str.charAt(str.length()-1)=='S') {
			if(monkeyWord(str.substring(1,str.length()-1)))return true;
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