import java.util.*;
import java.io.*;
public class CCC09S3DegreesOfSeperation {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int adj[][]=new int [51][51];
    public static void main(String[] args) throws IOException {
    	adj[2][6]=adj[6][2]=1;
    	adj[1][6]=adj[6][1]=1;
    	adj[7][6]=adj[6][7]=1;
    	adj[3][6]=adj[6][3]=1;
    	adj[4][6]=adj[6][4]=1;
    	adj[5][6]=adj[6][5]=1;
    	
    	adj[3][4]=adj[4][3]=1;
    	adj[3][5]=adj[5][3]=1;
    	adj[5][4]=adj[4][5]=1;
    	
    	adj[3][15]=adj[15][3]=1;
    	adj[13][15]=adj[15][13]=1;
    	
    	adj[13][12]=adj[12][13]=1;
    	adj[13][14]=adj[14][13]=1;
    	
    	adj[16][18]=adj[18][16]=1;
    	adj[18][17]=adj[17][18]=1;
    	adj[17][16]=adj[16][17]=1;
    	
    	adj[11][12]=adj[12][11]=1;
    	adj[9][12]=adj[12][9]=1;

    	adj[11][10]=adj[10][11]=1;
    	adj[9][10]=adj[10][9]=1;
    	
    	adj[9][8]=adj[8][9]=1;
    	adj[7][8]=adj[8][7]=1;
    	
    	
    	while(true) {
    		char ch = readCharacter();
    		if(ch=='q')break;
    		if(ch=='i') {
    			int x=readInt();
    			int y = readInt();
    			adj[x][y]=adj[y][x] = 1;
    		}
    		else if(ch=='d') {
    			int x=readInt();
    			int y = readInt();
    			adj[x][y]=adj[y][x] = 0;
    		}
    		else if(ch=='n') {
    			int x=readInt();
    			int ans=0;
    			for(int i =0;i<51;i++)
    				ans+=adj[x][i];
    			System.out.println(ans);
    		}
    		else if(ch=='f') {
    			int x=readInt();
    			Set<Integer> set = new HashSet();
    			for(int i =0;i<51;i++) {
    				if(adj[x][i]==1) {
    					for(int j =0;j<51;j++)
    						if(adj[x][j]==0 && adj[i][j]==1 && x != j) set.add(j);
    				}
    			}
    			System.out.println(set.size());
    		}
    		else if(ch=='s') {
    			int x = readInt();
    			int y = readInt();
    			int dis[]= new int [51];
    			boolean visit[]=new boolean[51];
    			Queue<Integer> que = new LinkedList();
    			que.add(x);
    			visit[x]=true;
    			dis[x]=0;
    			while(!que.isEmpty()) {
    				int cur = que.poll();
    				for(int nxt=1;nxt<51;nxt++) {
    					if(adj[cur][nxt]==1 && !visit[nxt]) {
    						que.add(nxt);
    						visit[nxt]=true;
    						dis[nxt]=dis[cur]+1;
    					}
    				}
    			}
    			if(visit[y])System.out.println(dis[y]);
    			else System.out.println("Not connected");
    			
    			
    		}
    		
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