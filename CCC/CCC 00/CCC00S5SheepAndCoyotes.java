import java.util.*;
import java.io.*;
public class CCC00S5SheepAndCoyotes {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int numSheep = readInt();
    	Coords sheep[] = new Coords[numSheep];
    	HashSet <Integer> ans = new HashSet<Integer>(); 
    	for(int i =0;i<numSheep;i++) {
    		sheep[i]= new Coords(readDouble(),readDouble());
    	}
    	
    	
    	for(double i =0;i<=1000;i+=0.01) {
    		double min = Double.MAX_VALUE;
    		int sheepID = 0;
    		for(int j =0;j<numSheep;j++) {
    			double d = dist(sheep[j],i);
    			if(d<min) {
    				min = d;
    				sheepID=j;
    			}
    		}
    		ans.add(sheepID);
    	}
    	List<Integer> finAns = new ArrayList<Integer>(ans);
//    	System.out.println(finAns.toString());
    	for(int i =0;i<ans.size();i++) {
    		System.out.printf("The sheep at (%.02f, %.02f) might be eaten.",sheep[finAns.get(i)].x,sheep[finAns.get(i)].y);
    		System.out.println();
    	}
    	
    	
    }
    private static double dist(Coords coords, double i) {
		return Math.sqrt(Math.pow(coords.x-i,2)+Math.pow(coords.y,2));//can remove sqrt for optimization
		
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
class Coords{
	public double x,y;
	public Coords(double a, double b) {
		x=a;
		y=b;
	}
}