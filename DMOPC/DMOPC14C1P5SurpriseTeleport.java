import java.util.*;
import java.io.*;
public class DMOPC14C1P5SurpriseTeleport {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int R = readInt();
    	int C = readInt();
    	boolean map[][]=new boolean[R][C];
    	int sR = readInt();
    	int sC = readInt();
    	int eR = readInt();
    	int eC = readInt();
    	for(int i =0;i<R;i++) {
    		char ch [] = readLine().toCharArray();
    		for(int j =0;j<C;j++) {
    			if(ch[j]=='O')
    				map[i][j] =true;
				else
					map[i][j] = false;
    		}
    	}
    	
    	boolean vis[][]= new boolean[R][C];
    	int dis[][]= new int[R][C];
    				
		//BFS
		Queue<Integer> queRow = new LinkedList<Integer>();
    	Queue<Integer> queColumn = new LinkedList<Integer>();
    	int direction[][] = {{-1,0},{0,1},{0,-1},{1,0}};
    	queRow.add(sR);
    	queColumn.add(sC);
    	vis[sR][sC]=true;
    	dis[sR][sC]=0;
    	while(!queRow.isEmpty()) {
			int r = queRow.poll();
			int c = queColumn.poll();
			for(int n=0;n<4;n++) {
				int r2 = direction[n][0]+r;
				int c2 = direction[n][1]+c;
				if(r2<0||r2>=R||c2<0||c2>=C||!map[r2][c2])continue;
				if(!vis[r2][c2]) {
					queRow.add(r2);
					queColumn.add(c2);
					vis[r2][c2]= true;
					dis[r2][c2]=dis[r][c]+1;
				}
			}
		}
   
    	
    	int T = readInt();
    	int min=Integer.MAX_VALUE;
    	for(int i =0;i<T;i++) {
    		int pR =readInt();
    		int pC = readInt();
    		if(dis[pR][pC]==0&&pR!=sR&&pC!=sC)continue;
    		
    		min = Math.min(dis[pR][pC], min);
    	}
    	System.out.println(dis[eR][eC]-min);

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