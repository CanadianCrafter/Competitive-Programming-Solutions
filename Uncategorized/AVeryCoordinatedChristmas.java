import java.util.*;
import java.io.*;
public class AVeryCoordinatedChristmas {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int M,N;
    static boolean[][] map;
    public static void main(String[] args) throws IOException {
    	N = readInt();
    	M = readInt();
    	map = new boolean[N][M];
    	int sR=0,sC=0,pR=0,pC=0,eR = 0,eC=0;
    	for(int i =0;i<N;i++) {
    		char ch [] = readLine().toCharArray();
    		for(int j =0;j<M;j++) {
    			if(ch[j]=='#') {
    				map[i][j] =false;
    			}
				else {
					map[i][j] = true;
					if(ch[j]=='O') {
						sR=i;
						sC=j;
					}
					else if(ch[j]=='P') {
						pR=i;
						pC=j;
					}
					else if(ch[j]=='X') {
						eR=i;
						eC=j;
					}
				}
    		}
    	}
    	int d1 = bfs(sR,sC,pR,pC);
    	int d2 = bfs(pR,pC,eR,eC);
    	if(d1<0||d2<0)System.out.println(-1);
    	else System.out.println(d1+d2);
    	
    	
    }
    private static int bfs(int sR, int sC, int eR, int eC) {
    	boolean vis[][]= new boolean[N][M];
    	int dis[][] = new int[N][M];
    	Queue<Integer> queRow = new LinkedList<Integer>();
    	Queue<Integer> queColumn = new LinkedList<Integer>();
    	int direction[][] = {{-1,0},{0,1},{0,-1},{1,0}};
    	queRow.add(sR);
    	queColumn.add(sC);
    	vis[sR][sC]=true;
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
					dis[r2][c2]=dis[r][c]+1;
				}
			}
			if(vis[eR][eC])return dis[eR][eC];
		}
    	return -1;
    	
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