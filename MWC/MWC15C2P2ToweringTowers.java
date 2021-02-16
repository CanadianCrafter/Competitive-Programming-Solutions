import java.util.*;
import java.io.*;
public class MWC15C2P2ToweringTowers {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	ArrayList<Integer> num = new ArrayList<Integer>();
    	ArrayList<Integer> sums = new ArrayList<Integer>();
    	for(int i =0;i<N;i++) {
    		int n = readInt();
    		num.add(n);
    		int sum = 0;
    		
    		
    		for(int j = num.size()-1;j>0;) {
    			if (j==0)break;
    			if(num.get(j-1)<=n) {
    				int pastSum = sums.get(j-1);
    				sum+=  pastSum;
    				if(pastSum!=0)j-=sums.get(j-1);
    				else j--;
    				if(j<=0)sum++;
    			}
    			else {
    				sum++;
    				break;
    			}
    		}
    		
    		sums.add(sum);
    		System.out.print(sum+" ");
    	}
    	
    	
    	
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