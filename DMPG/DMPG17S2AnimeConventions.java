import java.util.*;
import java.io.*;

public class DMPG17S2AnimeConventions{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	static int id[];
	static int sz[];

	public static void main(String[] args) throws IOException {
		int N = readInt();
		int n = readInt();
		id = new int[N];
		sz = new int[N];

		for (int i = 0; i < N; i++) {
			id[i] = i;
			sz[i] = 1;
		}

		for (int i = 0; i < n; i++) {
			char ch = readCharacter();
			int p = readInt()-1;
			int q = readInt()-1;
			p = root(p);
			q = root(q);
			if (ch == 'A') {
				union(p, q);
			}
			else if(ch=='Q'){
				check(p, q);
			}

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

	private static int root(int i) {
		while (i != id[i]) {
			id[i] = id[id[i]];
			i = id[i];
		}
		return i;
	}

	private static void union(int p, int q) {
		if (sz[p] > sz[q]) {
			id[q] = p;
			sz[p] += sz[q];
		} else {
			id[p] = q;
			sz[q] += sz[p];
		}
	}

	private static void check(int p, int q) {
		if (p == q)
			System.out.println("Y");
		else
			System.out.println("N");
	}
}
