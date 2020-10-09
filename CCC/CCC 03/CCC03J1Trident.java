import java.util.Scanner;

public class CCC03J1Trident {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int t= input.nextInt();
		int s= input.nextInt();
		int h= input.nextInt();
		String prongs = "*";
		String handle = " ";
		
		for(int k = 0; k <2; k++) {
			for(int i = 0; i < s; i++) {
				prongs+= " ";			
			}
			prongs +="*";
		}
		
		for(int i = 0; i <t; i++) {
			System.out.println(prongs);
		}
		for(int i = 0; i <3+2*s; i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int i = 0; i <s; i++) {
			handle+=" ";
		}
		handle += "*";
		for(int i = 0; i <h; i++) {
			System.out.println(handle);
		}
	}
}
