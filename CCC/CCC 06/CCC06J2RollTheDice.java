import java.util.*;
import java.io.*;
public class CCC06J2RollTheDice {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
    	int m = readInt();
    	int n = readInt();
    	if (m >= 10)
			m = 9;
		if (n >= 10)
			n = 9;
		int ans = m+n - 9;
		if(ans>1)
			System.out.println("There are " +ans+ " ways to get the sum 10.");
		else if (ans == 1)
			System.out.println("There is 1 way to get the sum 10.");
		else
			System.out.println("There are 0 ways to get the sum 10.");
    }
   
    static int readInt () throws IOException {
        return Integer.parseInt(input.readLine());
    }
    
}

