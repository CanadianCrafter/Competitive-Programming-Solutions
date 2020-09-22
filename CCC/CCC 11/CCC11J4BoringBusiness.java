import java.util.*;
import java.io.*;

public class CCC11J4BoringBusiness {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	static boolean arr[][] = new boolean[205][405];
	static int curX = 0;
	static int curY = 0;
	static int dx;
	static int dy;
	static boolean flag = false;

	public static void main(String[] args) throws IOException {
		move('d', 3);
		move('r', 3);
		move('d', 2);
		move('r', 2);
		move('u', 2);
		move('r', 2);
		move('d', 4);
		move('l', 8);
		move('u', 2);
		flag = true;

		char dir;
		int steps;
		boolean check;
		do {
			dir = readCharacter();
			if(dir == 'q') break;
			steps = readInt();
			check = move(dir, steps);
			
			if (check) {
				System.out.println("safe");
			} else {
				System.out.println("DANGER");
			}

		} while (dir != 'q' && check == true);

	}

	private static boolean move(char dir, int steps) {
		dy = 0;
		dx = 0;
		if (dir == 'u') {
			dy = 1;
		} else if (dir == 'd') {
			dy = -1;
		} else if (dir == 'r') {
			dx = 1;
		} else {
			dx = -1;
		}
		if (flag) {
			System.out.print(curX + dx * steps + " ");
			System.out.print(curY + dy * steps + " ");
		}
		
		for (int i = 0; i < steps; i++) {
			curX += dx;
			curY += dy;
			if (arr[-curY][curX + 200])	return false;
			arr[-curY][curX + 200] = true;

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