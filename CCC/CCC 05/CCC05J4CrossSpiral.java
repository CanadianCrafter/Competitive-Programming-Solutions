import java.util.*;
import java.io.*;
public class CCC05J4CrossSpiral {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static boolean arr[][];
	static int curX;
	static int curY=1;
    public static void main(String[] args) throws IOException {
    	int rX = readInt();
    	int rY = readInt();
    	int cX = readInt();
    	int cY = readInt();
    	int steps = readInt();
    	curX=cX+1;
    	arr = new boolean[rY+2][rX+2];
    	for(int i =0;i<rX+2;i++) {
    		arr[0][i]=true;
    		arr[rY+1][i]=true;
    	}
    	for(int i =0;i<rY+2;i++) {
    		arr[i][0]=true;
    		arr[i][rX+1]=true;
    	}
    	for(int i =1;i<cX+1;i++) {
    		for(int j =1;j<cY+1;j++) {
        		arr[j][i]=true;
        		arr[rY-j+1][i]=true;
        		arr[j][rX-i+1]=true;
        		arr[rY-j+1][rX-i+1]=true;
        	}
    	}
    	arr[curY][curX]=true;
    	boolean first=true;
    	while(steps>0) {
    		//segment 1 (so, very, bodged)
    		int cnt=0;
    		while(arr[curY][curX+1]==false){
    			arr[curY][curX+1]=true;
    			cnt++;
    			steps--;
    			curX++;
    			if(steps==0)break;
    		}
    		if(cnt==0&&!first)break;
    		if(steps==0)break;
    		first=false;
    		//segment 2
    		cnt=0;
    		while(arr[curY+1][curX]==false){
    			arr[curY+1][curX]=true;
    			cnt++;
    			steps--;
    			curY++;
    			if(arr[curY][curX+1]==false)break;
    			if(steps==0)break;
    		}
    		if(cnt==0)break;
    		if(steps==0)break;
    		//segment 3
    		cnt=0;
    		while(arr[curY][curX+1]==false){
    			arr[curY][curX+1]=true;
    			cnt++;
    			steps--;
    			curX++;
    			if(steps==0)break;
    		}
    		if(cnt==0)break;
    		if(steps==0)break;
    		//segment 4
    		cnt=0;
    		while(arr[curY+1][curX]==false){
    			arr[curY+1][curX]=true;
    			cnt++;
    			steps--;
    			curY++;
    			if(steps==0)break;
    		}
    		if(cnt==0)break;
    		if(steps==0)break;
    		//segment 5
    		cnt=0;
    		while(arr[curY][curX-1]==false){
    			arr[curY][curX-1]=true;
    			cnt++;
    			steps--;
    			curX--;
    			if(arr[curY+1][curX]==false)break;
    			if(steps==0)break;
    		}
    		if(cnt==0)break;
    		if(steps==0)break;
    		//segment 6
    		cnt=0;
    		while(arr[curY+1][curX]==false){
    			arr[curY+1][curX]=true;
    			cnt++;
    			steps--;
    			curY++;
    			if(steps==0)break;
    		}
    		if(cnt==0)break;
    		if(steps==0)break;
    		//segment 7
    		cnt=0;
    		while(arr[curY][curX-1]==false){
    			arr[curY][curX-1]=true;
    			cnt++;
    			steps--;
    			curX--;
    			if(steps==0)break;
    		}
    		if(cnt==0)break;
    		if(steps==0)break;
    		//segment 8
    		cnt=0;
    		while(arr[curY-1][curX]==false){
    			arr[curY-1][curX]=true;
    			cnt++;
    			steps--;
    			curY--;
    			if(arr[curY][curX-1]==false)break;
    			if(steps==0)break;
    		}
    		if(cnt==0)break;
    		if(steps==0)break;
    		//segment 9
    		cnt=0;
    		while(arr[curY][curX-1]==false){
    			arr[curY][curX-1]=true;
    			cnt++;
    			steps--;
    			curX--;
    			if(steps==0)break;
    		}
    		if(cnt==0)break;
    		if(steps==0)break;
    		//segment 10
    		cnt=0;
    		while(arr[curY-1][curX]==false){
    			arr[curY-1][curX]=true;
    			cnt++;
    			steps--;
    			curY--;
    			if(steps==0)break;
    		}
    		if(cnt==0)break;
    		if(steps==0)break;
    		//segment 11
    		cnt=0;
    		while(arr[curY][curX+1]==false){
    			arr[curY][curX+1]=true;
    			cnt++;
    			steps--;
    			curX++;
    			if(arr[curY-1][curX]==false)break;
    			if(steps==0)break;
    		}
    		if(cnt==0)break;
    		if(steps==0)break;
    		//segment 12
    		cnt=0;
    		while(arr[curY-1][curX]==false){
    			arr[curY-1][curX]=true;
    			cnt++;
    			steps--;
    			curY--;
    			if(steps==0)break;
    		}
    		if(cnt==0)break;
    		if(steps==0)break;
    	}
    	System.out.println(curX);
    	System.out.println(curY);
    	

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