import java.util.*;
import java.io.*;
public class CCC08S3Maze {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    
    	int T = readInt();
    	for(int t=0;t<T;t++) {
    		int R = readInt();
    		int C = readInt();
    		int[][] map  = new int[R][C];
    		for(int i =0;i<R;i++) {
    			char ch[] = readLine().toCharArray();
    			for(int j =0;j<C;j++) {
    				if(ch[j]=='+') map[i][j]=0;
    				else if(ch[j]=='-') map[i][j]=1;
    				else if(ch[j]=='|') map[i][j]=2;
    				else if(ch[j]=='*') map[i][j]=3;
    			}
    		}
    		boolean vis[][]= new boolean[R][C];
        	int dis[][]= new int[R][C];
        				
    		//BFS
    		Queue<Integer> queRow = new LinkedList<Integer>();
        	Queue<Integer> queColumn = new LinkedList<Integer>();
        	int direction[][][] = {
        			{{-1,0},{0,1},{0,-1},{1,0}},
        			{{0,1},{0,-1}},
        			{{-1,0},{1,0}},
        			{}
        			};
        	queRow.add(0);
        	queColumn.add(0);
        	vis[0][0]=true;
        	dis[0][0]=1;
        	while(!queRow.isEmpty()) {
    			int r = queRow.poll();
    			int c = queColumn.poll();
    			for(int n=0;n<direction[map[r][c]].length;n++) {
    				int r2 = direction[map[r][c]][n][0]+r;
    				int c2 = direction[map[r][c]][n][1]+c;
    				if(r2<0||r2>=R||c2<0||c2>=C||map[r2][c2]==3)continue;
    				if(!vis[r2][c2]) {
    					queRow.add(r2);
    					queColumn.add(c2);
    					vis[r2][c2]= true;
    					dis[r2][c2]=dis[r][c]+1;
    				}
    			}
    		}
        	System.out.println(vis[R-1][C-1]?dis[R-1][C-1]:-1);
    		
    		
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