import java.util.*;
public class CCC19J3ColdCompress {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); input.nextLine();
		while(input.hasNextLine()) {
			String s = input.nextLine();
			for(int i=0,j=0;i<s.length();) {
				while(j<s.length()&&s.charAt(i)==s.charAt(j)) {
					j++;
				}
				System.out.print((j-i)+" " +s.charAt(i) + " ");
				i=j;
			}
			System.out.println();
		}
		
	}

}
