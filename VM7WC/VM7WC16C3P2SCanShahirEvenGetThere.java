import java.util.*;
import java.io.*;
public class VM7WC16C3P2SCanShahirEvenGetThere {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	int M = readInt();
    	int A = readInt();
    	int B = readInt();
    	LinkedList<Integer> adjList[] = new LinkedList[N+1];
    	for(int i=0; i < N+1; i++) adjList[i] = new LinkedList();
    	for(int i =0;i<M;i++) {
    		int x = readInt();
    		int y = readInt();
    		adjList[x].add(y);
    		adjList[y].add(x);
    	}
    	LinkedList<Integer> queue = new LinkedList<Integer>();
    	boolean visited[] = new boolean[N+1];
    	visited[A]=true;
    	queue.add(A);
    	while(queue.size()!=0) {
    		int rootNode = queue.poll();
			Iterator<Integer> itr = adjList[rootNode].listIterator(); 
			while (itr.hasNext()){ 
			    int n = itr.next(); 
			    if (!visited[n]) { 
			        visited[n] = true; 
			        queue.add(n); 
			    } 
			} 
    	}
    	if(visited[B]==true)System.out.println("GO SHAHIR!");
    	else System.out.println("NO SHAHIR!");
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
