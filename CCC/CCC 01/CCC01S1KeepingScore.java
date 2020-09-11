import java.util.*;
import java.io.*;
public class CCC01S1KeepingScore {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static ArrayList<Character> c = new ArrayList<Character>(); 
    static ArrayList<Character> d = new ArrayList<Character>(); 
    static ArrayList<Character> h = new ArrayList<Character>(); 
    static ArrayList<Character> s = new ArrayList<Character>(); 
    static int points[] = new int[4];
    public static void main(String[] args) throws IOException {
    	
    	
    	String str = next();
    	char hold ='C';
    	for(int i =1; i<str.length(); i++) {
    		char letter = str.charAt(i);
    		if(letter=='D'||letter=='H'||letter=='S') {
    			hold = letter;
    			continue;
    		}
    		if(hold=='C') {
    			c.add(letter);
    			if(letter=='A') points[0]+=4;
    			else if(letter=='K') points[0]+=3;
    			else if(letter=='Q') points[0]+=2;
    			else if(letter=='J') points[0]+=1;
    		}
    		else if(hold=='D') {
    			d.add(letter);
    			if(letter=='A') points[1]+=4;
    			else if(letter=='K') points[1]+=3;
    			else if(letter=='Q') points[1]+=2;
    			else if(letter=='J') points[1]+=1;
    		}
    		else if(hold=='H') {
    			h.add(letter);
    			if(letter=='A') points[2]+=4;
    			else if(letter=='K') points[2]+=3;
    			else if(letter=='Q') points[2]+=2;
    			else if(letter=='J') points[2]+=1;
    		}
    		else if(hold=='S') {
    			s.add(letter);
    			if(letter=='A') points[3]+=4;
    			else if(letter=='K') points[3]+=3;
    			else if(letter=='Q') points[3]+=2;
    			else if(letter=='J') points[3]+=1;
    		}
    	}
    	if(c.size()==0) points[0]+=3;
    	else if(c.size()==1) points[0]+=2;
    	else if(c.size()==2) points[0]+=1;
    	
    	if(d.size()==0) points[1]+=3;
    	else if(d.size()==1) points[1]+=2;
    	else if(d.size()==2) points[1]+=1;
    	
    	if(h.size()==0) points[2]+=3;
    	else if(h.size()==1) points[2]+=2;
    	else if(h.size()==2) points[2]+=1;
    	
    	if(s.size()==0) points[3]+=3;
    	else if(s.size()==1) points[3]+=2;
    	else if(s.size()==2) points[3]+=1;
 
    	
    	System.out.println("Cards Dealt              Points");
    	System.out.print("Clubs ");
    	printer(c);
    	System.out.println(points[0]);
    	System.out.print("Diamonds ");
    	printer(d);
    	System.out.println(points[1]);
    	System.out.print("Hearts ");
    	printer(h);
    	System.out.println(points[2]);
    	System.out.print("Spades ");
    	printer(s);
    	System.out.println(points[3]);
    	
    	System.out.print("Total ");
    	
    	int total = 0;
    	for(int i =0; i<4;i++) {
    		total += points[i];
    	}
    	System.out.print(total);
    	
    }
    static void printer(ArrayList<Character> L) {
    	for(int i=0;i<L.size();i++) {
    		System.out.print(L.get(i) + " ");
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
