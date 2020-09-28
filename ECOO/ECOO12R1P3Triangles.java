import java.util.*;
import java.io.*;
public class ECOO12R1P3Triangles {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	for(int i =0;i<5;i++) {
    		int px = readInt();
    		int py = readInt();
    		double x1;
    		double y1;
    		double x2;
    		double y2;
    		double x3;
    		double y3;
    		if(px!=0) {
    			double m = (float) py/px;
				double rotateM = (m-Math.sqrt(3))/(1+Math.sqrt(3)*m);
        		double sumSquareP = Math.pow(px, 2)+Math.pow(py, 2);
        		x1 = Math.sqrt(sumSquareP/(Math.pow(rotateM, 2)+1));
        		y1 = rotateM*x1;
        		x2 = -1*x1;
        		y2 = -y1;
        		double d1 = Math.sqrt(Math.pow(px-x1,2)+Math.pow(py-y1,2));
        		double d2 = Math.sqrt(Math.pow(px-x2,2)+Math.pow(py-y2,2));
        		if(d1<d2) {
        			x3 = 2*px-x1;
        			y3 = 2*py-y1;
        		}
        		else {
        			x3 = 2*px-x2;
        			y3 = 2*py-y2;
        		}
        		System.out.printf("(%.1f,%.1f) (%.1f,%.1f) (%.1f,%.1f)",x1,y1,x2,y2,x3,y3);
        		System.out.println();
    		}
        		
    		if(px==0) {
    			y1 = (float) py/2;
    			x1 = Math.sqrt(3)*y1;
    			x2 = -1*x1;
    			y2 = y1+py;
    			x3 = -1*x1;
    			y3 = y1-py;
    			System.out.printf("(%.1f,%.1f) (%.1f,%.1f) (%.1f,%.1f)",x1,y1,x2,y2,x3,y3);
        		System.out.println();
    		}
    		
    		
    		
    		
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