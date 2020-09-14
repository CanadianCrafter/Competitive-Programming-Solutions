import java.util.*;
import java.io.*;
public class CCC02S2FractionAction {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int num = readInt();
    	int den = readInt();
    	if (num==0) {
    		System.out.println("0");
    		return;
    	}
    	if(num%den==0) {
    		System.out.println(num/den);
    		return;
    	}
    	int intAns = num/den;
    	int numArr[] = new int[num+1];
    	for(int i = 2;i<=numArr.length;) {
    		if (num%i==0) {
    			num/=i;
    			numArr[i]++;
    		}
    		else i++;
    	}
    	int denArr[] = new int[den+1];
    	for(int i = 2;i<=denArr.length;) {
    		if (den%i==0) {
    			den/=i;
    			denArr[i]++;
    		}
    		else i++;
    	}
    	
    	for(int i=0;i<Math.min(denArr.length,numArr.length);i++) {
    		int sub = Math.min(numArr[i],denArr[i]);
    		numArr[i]-=sub;
    		denArr[i]-=sub;
    	}
    	
    	int numAns = 1;
    	int denAns = 1;
    	for(int i =2;i<numArr.length;i++) numAns *= Math.pow(i,numArr[i]);
    	for(int i =2;i<denArr.length;i++) denAns *= Math.pow(i,denArr[i]);
    	while(numAns>0) {
    		numAns-=denAns;
    	}
    	numAns+=denAns;
    	if(intAns==0)System.out.printf("%d/%d",numAns,denAns);
    	else System.out.printf("%d %d/%d",intAns, numAns,denAns);
    		
    	
    	
    }
   
	static String next () throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static long readLong () throws IOException {
        return Long.parseLong(next());
    }
    static int readInt () throws IOException {
        return Integer.parseInt(next());
    }
    static double readDouble () throws IOException {
        return Double.parseDouble(next());
    }
    static char readCharacter () throws IOException {
        return next().charAt(0);
    }
    static String readLine () throws IOException {
        return br.readLine().trim();
    }
}                