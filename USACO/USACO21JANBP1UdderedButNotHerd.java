import java.util.*;
import java.io.*;
public class USACO21JANBP1UdderedButNotHerd {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	char alphabet[] = readLine().toCharArray();
    	char ch[] = readLine().toCharArray();
    	int i1=0;
    	int i2=0;
    	int ans =1;
    	do{    		
    		if(alphabet[i1]!=ch[i2])
    			i1++;
    		else {
    			i1++;
    			i2++;
    		}
    		if(i1==26) {
    			i1=0;
    			ans++;
    		}
    		
    	}while(i2<ch.length);
    	System.out.println(ans);
    }
    static String readLine () throws IOException {
        return br.readLine().trim();
    }
}