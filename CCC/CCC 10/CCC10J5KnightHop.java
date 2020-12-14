import java.util.*;
import java.io.*;
public class CCC10J5KnightHop {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	
    	int dis[][] = new int [8][8];
    	boolean vis[][] = new boolean [8][8];
    	int sR = readInt()-1;
    	int sC = readInt()-1;
    	int dR = readInt()-1;
    	int dC = readInt()-1;
    	
    	int directions[][] = {{2,-1},{2,1},{-2,-1},{-2,1},{1,2},{-1,2},{1,-2},{-1,-2}};
    	
    				
		//BFS
		Queue<Integer> queRow = new LinkedList<Integer>();
		Queue<Integer> queColumn = new LinkedList<Integer>();
		queRow.add(sR);
		queColumn.add(sC);
		vis[sR][sC]=true;
		dis[sR][sC]=0;
		while(!queRow.isEmpty()) {
			int r = queRow.poll();
			int c = queColumn.poll();
			for(int n =0;n<8;n++) {
				int r2 = r +directions[n][0];
				int c2 = c + directions[n][1];
				if(r2>=8||r2<0||c2>=8||c2<0)
					continue;
				if(!vis[r2][c2]) {
					queRow.add(r2);
					queColumn.add(c2);
					vis[r2][c2]=true;
					dis[r2][c2]=dis[r][c]+1;
				}
			}
			
		}
		System.out.println(dis[dR][dC]);
		
    				
    				
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