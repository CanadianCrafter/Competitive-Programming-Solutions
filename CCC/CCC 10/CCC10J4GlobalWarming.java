import java.util.*;
public class CCC10J4GlobalWarming {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			int n = input.nextInt();
			if (n==0)break;
			int a[] = new int[n];
			for(int i=0;i<n;i++) {
				a[i] = input.nextInt();
			}
			
			int dif[] = new int [a.length-1];
			for(int i= 0;i<dif.length;i++) {
				dif[i]=a[i+1]-a[i];
			}
			int cycle =0;
			for(cycle=1;cycle<dif.length;cycle++) {
				boolean flag = true;
				for(int i=0;i<dif.length;i++) {
					if (dif[i]!= dif[i%cycle])flag=false;
				}
				if(flag) break;
			}
			System.out.println(n==1?0:cycle); //condition? true (something): false(something)
			
		}
		
	}

}
