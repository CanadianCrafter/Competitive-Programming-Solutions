import java.util.*;
import java.io.*;
public class TSOC16C1P4AlexAndAnimalRights {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int map[][];
    static int time[];
    public static void main(String[] args) throws IOException {
    	int R = readInt();
    	int C = readInt();
    	char map[][] = new char [R][C];
    	for(int i =0;i<R;i++) {
    		map[i]= readLine().toCharArray();
    	}
    	
    	boolean vis[][]= new boolean[R][C];
    	int cnt=0;
    	
    	for(int i =0;i<R;i++) {
    		for(int j = 0;j<C;j++) {
    			
    			if(map[i][j]!='#'&&!vis[i][j]) {
    				//BFS
    				boolean flag=false;
    				Queue<Integer> queRow = new LinkedList<Integer>();
    		    	Queue<Integer> queColumn = new LinkedList<Integer>();
    		    	int direction[][] = {{-1,0},{0,1},{0,-1},{1,0}};
    		    	queRow.add(i);
    		    	queColumn.add(j);
    		    	vis[i][j]=true;
    		    	while(!queRow.isEmpty()) {
    					int r = queRow.poll();
    					int c = queColumn.poll();
    					if(map[r][c]=='M'&&!flag) {
    						cnt++;
    						flag=true;
    					}
    					for(int n=0;n<4;n++) {
    						int r2 = direction[n][0]+r;
    						int c2 = direction[n][1]+c;
    						if(r2<0||r2>=R||c2<0||c2>=C||map[r2][c2]=='#')continue;
    						if(!vis[r2][c2]) {
    							queRow.add(r2);
    							queColumn.add(c2);
    							vis[r2][c2]= true;
    							if(map[r][c]=='M'&&!flag) {
    	    						cnt++;
    	    						flag=true;
    	    					}
    						}
    					}
    				}
    				
    			}
    		}
    	}
    	System.out.println(cnt);
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