import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class DMOPC14C8P2Tides {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	static int arr[];
	static int maxIndex = 0;
	static int minIndex = 0;

	public static void main(String[] args) throws IOException {
		int N = readInt();
		int max = 0;
		int min = 20000;
   	
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			int num = readInt();
			arr[i] = num;
			if (num > max) {
				max = num;
				maxIndex = i;
			}
			if (num < min) {
				min = num;
				minIndex = i;
			}

		}
		if (check()) {
			System.out.println(max - min);
		} else {
			System.out.println("unknown");
		}

	}

	private static boolean check() {
		if (minIndex>maxIndex) {
			return false;
		}
		for (int i = minIndex + 1; i <= maxIndex; i++) {
			if (arr[i] < arr[i - 1]) {
				return false;
			}
		}
		return true;
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