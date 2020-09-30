import java.util.*;
import java.io.*;
public class CCC16S1Ragaman {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static HashSet <Character> set;
    static Map<Character, Integer> map1;
    static 	Map<Character, Integer> map2;
    public static void main(String[] args) throws IOException {
    	map1 = new HashMap();
        map2 = new HashMap();
    	set = new HashSet<Character>(); 
    	String str1 = next();
    	for(int i =0;i<str1.length();i++) {
    		map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0)+1);
       	}
    	
    	
    	String str2 = next();
    	for(int i =0;i<str2.length();i++) {
    		if(str2.charAt(i)!='*') {
    			set.add(str2.charAt(i));
    			map2.put(str2.charAt(i), map2.getOrDefault(str2.charAt(i), 0)+1);
    		}
       	}
    	check(str1.length(), str2.length());
    	
    }
    private static void check(int j, int k) {
    	if(j != k) {
    		System.out.println("N");
    		return;   		
    	}
    	if(map2.size()>map1.size()) {
    		System.out.println("N");
    		return;
    	}
    	Object[] arr = set.toArray();
    	
    	for(int i =0;i<arr.length;i++) {
    		if (map1.get(arr[i]) == null) {
    			System.out.println("N");
        		return;
    		}
    		int a = map1.get(arr[i]);
    		int b = map2.get(arr[i]);
    		
    		if(b>a) {
    			System.out.println("N");
        		return;
    		}
    		
    	}
    	System.out.println("A");
		return;
		
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