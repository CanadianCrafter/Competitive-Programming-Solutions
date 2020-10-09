import java.util.Scanner;

public class CCC00J29966 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int m = input.nextInt();
		int n = input.nextInt();
		int answer=0;
		
		
		for(int num = m; num <=n; num++) {
			String flip = "";
			String stringNum = Integer.toString(num);
			int len = stringNum.length();
			for(int i = len -1 ; i >=0 ; i--) {
				if (stringNum.charAt(i) == '0') {
					flip+= "0";
				}
				else if (stringNum.charAt(i) == '1') {
					flip+= "1";
				}
				
				else if (stringNum.charAt(i) == '8') {
					flip+= "8";
				}
				
				else if (stringNum.charAt(i) == '6') {
					flip+= "9";
				}
				
				else if (stringNum.charAt(i) == '9') {
					flip+= "6";
				}
				else {
					break;
				}
				if (flip.equals(stringNum)) {
					answer++;
				}
				
				
			}
			
			
						
			
		}
		System.out.println(answer);
		
	}
	
}
