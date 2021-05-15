import java.util.*;
import java.io.*;

public class SingleSourceShortestPath {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		//get inputs
		int N = readInt();
		int M = readInt();
		
		//distance array
		int dis[] = new int[N + 1];
		Arrays.fill(dis, Integer.MAX_VALUE); //set distances to infinity
		dis[1] = 0; //distance from starting node to itself is zero
		
		//adjacency list
		ArrayList<Edge> adj[] = new ArrayList[N + 1];
		for (int i = 0; i <= N; i++) adj[i] = new ArrayList<Edge>();
		
		//priority queue
		PriorityQueue<Edge> pq = new PriorityQueue();
		pq.add(new Edge(1, 0)); //add starting node
		
		//get inputs and fill adjacency list
		for (int i = 0; i < M; i++) {
			int u = readInt(), v = readInt(), w = readInt();
			adj[u].add(new Edge(v, w)); //undirected graph
			adj[v].add(new Edge(u, w));
		}

		// check all connected nodes
		while (!pq.isEmpty()) { 
			// the current node being checked
			Edge cur = pq.poll(); 
			// if the new distance is longer than the current distance, skip it
			if (cur.w > dis[cur.v])	continue; 
			// check all nodes adjacent to the current node
			for (Edge edge : adj[cur.v]) { 
				// check if the new distance is less than the old distance
				if (dis[edge.v] > dis[cur.v] + edge.w) { 
					// update distance
					dis[edge.v] = dis[cur.v] + edge.w; 	
					// add new node to be checked
					pq.add(new Edge(edge.v, dis[edge.v])); 
				}
			}
		}

		for (int i = 1; i <= N; i++)
			System.out.println(dis[i] != Integer.MAX_VALUE ? dis[i] : -1); //if distance is infinity, we have not visited it

	}

	static class Edge implements Comparable<Edge> {
		int v; // destination node
		int w; // weight
		// constructor

		public Edge(int v, int w) {
			this.v = v;
			this.w = w;
		}

		@Override
		public int compareTo(Edge x) {
			// sorts edges based on weight
			return Integer.compare(w, x.w);
		}

	}

	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}

	static long readLong() throws IOException {
		return Long.parseLong(next());
	}

	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}

	static double readDouble() throws IOException {
		return Double.parseDouble(next());
	}

	static char readCharacter() throws IOException {
		return next().charAt(0);
	}

	static String readLine() throws IOException {
		return br.readLine().trim();
	}

}
