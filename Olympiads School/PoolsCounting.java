import java.util.*;
import java.io.*;
public class PoolsCounting {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	int M = readInt();
    	int K = readInt();
    	boolean map[][] = new boolean [N][M];
    	for(int i =0;i<K;i++) {
    		map[readInt()-1][readInt()-1]=true;
    	}    	
    	
    	int ans=0;
    	boolean vis[][]= new boolean[N][M];
    	
    	for(int i =0;i<N;i++) {
    		for(int j = 0;j<M;j++) {
    			if(map[i][j]&&!vis[i][j]) {
    				
    				//BFS
    				Queue<Integer> queRow = new LinkedList<Integer>();
    		    	Queue<Integer> queColumn = new LinkedList<Integer>();
    		    	int direction[][] = {{-1,0},{0,1},{0,-1},{1,0}};
    		    	queRow.add(i);
    		    	queColumn.add(j);
    		    	vis[i][j]=true;
    		    	int cnt =0;
    		    	while(!queRow.isEmpty()) {
    					int r = queRow.poll();
    					int c = queColumn.poll();
    					cnt++;
    					for(int n=0;n<4;n++) {
    						int r2 = direction[n][0]+r;
    						int c2 = direction[n][1]+c;
    						if(r2<0||r2>=N||c2<0||c2>=M||!map[r2][c2])continue;
    						if(!vis[r2][c2]) {
    							queRow.add(r2);
    							queColumn.add(c2);
    							vis[r2][c2]= true;
    						}
    					}
    				}
    		    	ans++;
    				
    			}
    		}
    	}
    	System.out.println(ans);
    	
    	
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