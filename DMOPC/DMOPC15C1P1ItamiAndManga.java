import java.util.*;

import java.io.*;
public class DMOPC15C1P1ItamiAndManga {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	Node arr[] = new Node[N];
    	for(int i =0;i<N;i++) {
    		String str[] = readLine().split(" ");
    		arr[i]=new Node(str[0],Double.valueOf(str[1]));
    	}
    	Arrays.sort(arr);
    	System.out.println(arr[N-1].str);
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
    
    static class Node implements Comparable<Node>{
    	String str;
    	double w;
    	public Node(String str, double w) {
    		this.str=str;
    		this.w=w;
    	}
		@Override
		public int compareTo(Node x) {
			return Double.compare(w, x.w);
		}
    	
    	
    }
}