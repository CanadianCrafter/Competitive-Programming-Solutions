import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.*;
public class MockCCC19C1J4PusheenPlaysNekoAtsume {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		
		int n = readInt();
		Map<String, Integer> map = new HashMap();
		for(int i=0; i<n;i++) {
			String food = readLine();
			map.put(food, map.getOrDefault(food, 0)+1);
		}

		String list[] = {"Deluxe Tuna Bitz", "Bonito Bitz", "Sashimi", "Ritzy Bitz"};
		while(!map.isEmpty()) {
			int mx = 0; String food = "";
			for(String key: list) {
				if(!map.containsKey(key)) continue;
				if (map.get(key) > mx){
					mx = map.get(key); food = key;
				}
			}
			System.out.println(food + " " + map.get(food));
			map.remove(food);
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
