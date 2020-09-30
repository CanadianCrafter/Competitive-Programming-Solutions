import java.util.*;
import java.io.*;
public class CCC13S3ChancesOfWinning {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int ans=0;
    static int G,T,wins[];
    static boolean game[][];
    public static void main(String[] args) throws IOException {
    	T = readInt();
    	G = readInt();
    	game = new boolean[4][4];
    	wins=new int [4];
    	for(int i =0;i<4;i++) {
    		for(int j =0;j<4;j++) {
    			game[i][j]=false;
    		}
    	}
    	for(int i=0;i<G;i++) {
    		int A=readInt();
    		int B=readInt();
    		game[A-1][B-1]=true;
    		game[B-1][A-1]=true;
    		int sA = readInt();
    		int sB=readInt();
    		if(sA>sB)wins[A-1]+=3;
    		else if(sA<sB)wins[B-1]+=3;
    		else {
    			wins[A-1]++;
    			wins[B-1]++;
    		}
    	}
    	fun(6-G);
    	System.out.println(ans);
    }
    private static void fun(int rem) {
    	if(rem==0) {
    		for(int i =0;i<4;i++) {
    			if(i!=T-1&&wins[i]>=wins[T-1])return;
    		}
    		ans++;
    		return;
    	}
    	boolean[][] save=new boolean[4][4];
    	for(int i =0;i<4;i++)save[i]=game[i].clone();
    	for(int i =0;i<4;i++) {
    		for(int j =i+1;j<4;j++) {
    			if(!game[i][j]) {
    				game[i][j]=true;
    				rem--;
    				for(int k=0;k<3;k++) {
    					if(k==0) {
    						wins[i]+=3;
    						fun(rem);
    						wins[i]-=3;
    					}
    					else if(k==1) {
    						wins[j]+=3;
    						fun(rem);
    						wins[j]-=3;
    					}
    					else {
    						wins[i]++;
    						wins[j]++;
    						fun(rem);
    						wins[i]--;
    						wins[j]--;
    					}
    				}
    				rem++;
    			}
    		}
    	}
    	for(int n=0; n< 4; n++) game[n] = save[n].clone();
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