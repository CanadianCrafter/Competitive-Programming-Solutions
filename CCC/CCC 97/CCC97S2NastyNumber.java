import java.util.*;

public class CCC97S2NastyNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			ArrayList<Integer> sums = new ArrayList<Integer>();
			ArrayList<Integer> diff = new ArrayList<Integer>();
			int num = input.nextInt();
			for (int k = 1; k <= Math.sqrt(num); k++) {
				if (num % k == 0) {
					sums.add(k + (num / k));
					diff.add(Math.abs(k - (num / k)));
				}
			}
			Boolean FLAG = true;
			for (int a : sums) {
				for (int b : diff) {
					if (a == b) {
						System.out.printf("%d is nasty \n", num);
						FLAG = false;
						break;
					}

				}
			}
			if (FLAG) System.out.printf("%d is not nasty \n", num); 

		}

	}

}
