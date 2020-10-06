import java.util.*;
import java.io.*;
public class ECOO20P2OnlineShopping {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int T = readInt();
    	for(int t =0;t<T;t++) {
    		Map<String, List<item>> map = new HashMap();
    		int N = readInt();
    		for(int n =1;n<=N;n++) {
    			int M = readInt();
    			for(int m =1;m<=M;m++) {
    				String item=next();
    				int price= readInt();
    				int quantity= readInt();
    				if(!map.containsKey(item))map.put(item, new ArrayList<item>());
    				map.get(item).add(new item(price,quantity));
    			}
    		}
    		int K = readInt();
        	int ans=0;
        	for(int i =1;i<=K;i++) {
        		String str=next();
        		int q=readInt();
        		Collections.sort(map.get(str), new Comparator<item>(){
        			public int compare(item o1,item o2) {
            			return Integer.compare(o1.price, o2.price);
            		}});
        		for(item it:map.get(str)) {
        			if(it.quantity<=q) {
        				ans+=it.price*it.quantity;
        				q-=it.quantity;
        			}
        			else {
        				ans+=it.price*q;
        				q=0;
        				break;
        			}
        		}
        	}
        	System.out.println(ans);
        		
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
class item{
	int price;
	int quantity;
	public item(int p, int q) {
		price=p;
		quantity=q;
	}
}
