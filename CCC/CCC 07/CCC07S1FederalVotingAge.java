import java.util.Scanner;

public class CCC07S1FederalVotingAge {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numPeople = input.nextInt();
		
		int num;
		
		for(int i = 0; i <numPeople; i++ ) {
			num = input.nextInt();
			if(num<1989) {
				System.out.println("Yes");
				num = input.nextInt();
				num = input.nextInt();
			}
			else if(num>1989) {
				System.out.println("No");
				num = input.nextInt();
				num = input.nextInt();
			}
			else {
				num = input.nextInt();
				if(num<2) {
					System.out.println("Yes");
					num = input.nextInt();
				}
				else if(num>2) {
					System.out.println("No");
					num = input.nextInt();
				}
				else {
					num = input.nextInt();
					if(num<28) {
						System.out.println("Yes");
					}
					else if(num==28) {
						System.out.println("No");
					}
				}
			}
			
		}
	}
}
