import java.util.*;
import java.io.*;
public class DMOPC13C3P3CrossingField {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	int H = readInt();
    	int adj[][] = new int [N][N];
    	for(int i=0;i<N;i++) {
    		for(int j=0;j<N;j++) {
        		adj[i][j]=readInt();
        	}
    	}
    	
    	Queue<Integer> queRow = new LinkedList<Integer>();
    	Queue<Integer> queColumn = new LinkedList<Integer>();
    	boolean vis[][] =new boolean[N][N];
    	int direction[][] = {{-1,0},{0,1},{0,-1},{1,0}};
    	
    	queRow.add(0);
    	queColumn.add(0);
    	vis[0][0]=true;
    	while(!queRow.isEmpty()) {
			int r = queRow.poll();
			int c = queColumn.poll();
			for(int i=0;i<4;i++) {
				int r2 = direction[i][0]+r;
				int c2 = direction[i][1]+c;
				if(r2<0||r2>=N||c2<0||c2>=N|| Math.abs(adj[r2][c2]-adj[r][c])>H)continue;
				if(!vis[r2][c2]) {
					queRow.add(r2);
					queColumn.add(c2);
					vis[r2][c2]= true;
				}
			}
		}
    	System.out.println(vis[N-1][N-1]?"yes":"no");
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