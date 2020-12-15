import java.util.*;
import java.io.*;
public class CCC09S4ShopAndShip {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int N,D;
    static int shipping[];
    static int map[][];
    static int cost[];
    public static void main(String[] args) throws IOException {
    	N = readInt();
    	map = new int [N+1][N+1];
    	shipping = new int[N+1];
    	cost = new int [N+1];
    	int n = 100000;
    	
    	for(int i =0;i<N+1;i++) {
    		cost[i]=n;
    		shipping[i]=n;
    	}
    	
    	int T = readInt();
    	for(int i =0;i<T;i++) {
    		int x = readInt();
    		int y = readInt();
    		int c = readInt();
    		map[x][y]=c;
    		map[y][x]=c;
    	}
    	
    	int K = readInt();
    	for(int i =0;i<K;i++) {
    		cost[readInt()]=readInt();
    	}
    	D = readInt();
    	
		boolean vis[] = new boolean [N+1];
		shipping[D]=0;
		int cnt = 0;
		while(cnt<N) {
			int smallest = n;
			int city = 1;
			for(int i =1;i<N+1;i++) {
				if(!vis[i]&&shipping[i]<smallest) {
					smallest = shipping[i];
					city=i;
				}
			}
			
			vis[city]=true;
			cnt++;
			for(int i =1;i<N+1;i++) {
				if(map[city][i]>0&&!vis[i]) {
					if(shipping[i]>shipping[city]+map[city][i]) {
						shipping[i]=shipping[city]+map[city][i];
					}
				}
			}
			
			
		}
		int totalCost=0;
		int min = n;
		for(int i =1;i<N+1;i++) {
			min = Math.min(cost[i]+shipping[i],min);
		}
    	System.out.println(min);
    	
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