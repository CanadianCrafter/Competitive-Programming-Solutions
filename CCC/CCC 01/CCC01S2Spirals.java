import java.util.*;
import java.io.*;
public class CCC01S2Spirals {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int a[][]=new int [12][12];
    	int dir[][] = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
    	int length = 1;
    	int toLength = 0;
    	int dirIndex = 0;
    	int toTurn = 0;
    	int posX = 5;
    	int posY = 5;
    	int x = readInt();
    	int y = readInt();
    	int N = y-x+1;
    	for(int i =0;i<N;i++) {
    		a[posY][posX]=i+x;
    		posY +=dir[dirIndex][0];
    		posX +=dir[dirIndex][1];
    		toTurn++;
    		
        	if(toTurn==length) {
        		toTurn=0;
        		dirIndex++;
        		toLength++;
        	}
        	if(toLength==2) {
        		length++;
        		toLength=0;
        	}
        	dirIndex %= 4;
//        	System.out.println(dirIndex + " "+ length);
        	
    	}
    	
    	for(int line[] : a) {
			for(int num : line) {
				if(num!=0)System.out.print(num + "\t");
				else System.out.print("\t");
			}
			System.out.println();
		}
    	System.out.println();
    	

    	
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