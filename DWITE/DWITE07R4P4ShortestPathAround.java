import java.util.*;
import java.io.*;
public class DWITE07R4P4ShortestPathAround {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	for(int t =0;t<5;t++) {
    		boolean map[][]=new boolean[10][10];
    		
    		int sR=-1;
    		int sC=-1;
    		int dR=-1;
    		int dC=-1;
    		
    		
    		for(int i =0;i<10;i++) {
        		char ch [] = readLine().toCharArray();
        		for(int j =0;j<10;j++) {
        			if(ch[j]=='.')
        				map[i][j] =true;
    				else if(ch[j]=='#')
    					map[i][j] = false;
    				else if(ch[j]=='X') {
    					if(sR==-1) {
    						sR=i;
    						sC=j;
    						map[i][j] =true;
    					}
    					else{
    						dR=i;
    						dC=j;
    						map[i][j] =true;
        				}
    				}
        		}
        	}
    		readLine();
    		boolean vis[][]= new boolean[10][10];
        	int dis[][]= new int[10][10];
        				
    		//BFS
    		Queue<Integer> queRow = new LinkedList<Integer>();
        	Queue<Integer> queColumn = new LinkedList<Integer>();
        	int direction[][] = {{-1,0},{0,1},{0,-1},{1,0},{-1,-1},{1,1},{-1,1},{1,-1}};
        	queRow.add(sR);
        	queColumn.add(sC);
        	vis[sR][sC]=true;
        	dis[sR][sC]=0;
        	while(!queRow.isEmpty()) {
    			int r = queRow.poll();
    			int c = queColumn.poll();
    			for(int n=0;n<8;n++) {
    				int r2 = direction[n][0]+r;
    				int c2 = direction[n][1]+c;
    				if(r2<0||r2>=10||c2<0||c2>=10||!map[r2][c2])continue;
    				if(!vis[r2][c2]) {
    					queRow.add(r2);
    					queColumn.add(c2);
    					vis[r2][c2]= true;
    					dis[r2][c2]=dis[r][c]+1;
    				}
    			}
    		}
    		System.out.println(dis[dR][dC]);
    		
    		
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