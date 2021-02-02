import java.util.*;
import java.io.*;
public class CCC03S3FloorPlan {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int flooring = readInt();
    	int R = readInt();
    	int C = readInt();
    	boolean map[][] = new boolean [R][C];
    	for(int i =0;i<R;i++) {
    		char ch [] = readLine().toCharArray();
    		for(int j =0;j<C;j++) {
    			if(ch[j]=='.')
    				map[i][j] =true;
				else
					map[i][j] = false;
    		}
    	}
    	
    	boolean vis[][]= new boolean[R][C];
    	ArrayList<Integer> list  =new ArrayList<Integer>();
    	
    	for(int i =0;i<R;i++) {
    		for(int j = 0;j<C;j++) {
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
    						if(r2<0||r2>=R||c2<0||c2>=C||!map[r2][c2])continue;
    						if(!vis[r2][c2]) {
    							queRow.add(r2);
    							queColumn.add(c2);
    							vis[r2][c2]= true;
    						}
    					}
    				}
    		    	list.add(cnt);
    				
    			}
    		}
    	}
    	Collections.sort(list, Collections.reverseOrder());
    	int ans =0;
    	for(int i =0;i<list.size();i++) {
    		if(flooring-list.get(i)>=0){
    			flooring-=list.get(i);
    			ans++;
    		}
    		else break;
    	}
    	if(ans==1)System.out.printf("%d room, %d square metre(s) left over\n",ans,flooring);
    	else System.out.printf("%d rooms, %d square metre(s) left over\n",ans,flooring);
    	
    	
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