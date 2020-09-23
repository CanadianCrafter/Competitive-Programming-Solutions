import java.util.*;
import java.io.*;
public class CCC12S3AbsolutelyAcidic {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N = readInt();
    	int arr[] = new int [1001];
    	for(int i =0;i<N;i++) {
    		arr[readInt()]++;
    	}
    	
    	
    	int max = 0;
    	int max2 = 0;
	    ArrayList <Integer> list = new ArrayList<Integer>();
	    ArrayList <Integer> list2 = new ArrayList<Integer>();
    	for(int i =1;i<arr.length;i++) {
    		if(arr[i]==0)continue;
    		if(arr[i]>max) {
    			list2.clear();
    			list2.addAll(list);
    			list.clear();
    			list.add(i);
    			max2=max;
    			max=arr[i];
    		}
    		else if(arr[i]==max) {
	    		list.add(i);
	    		list2.clear();
	    		max2=max;
    		}
    		else if(arr[i]>max2) {
    			list2.clear();
    			list2.add(i);
    			max2=arr[i];
    		}
    		else if(arr[i]==max2) {
    			list2.add(i);
    		}
    	}
    	if(list.size()==1) {
    		if(list2.size()==1) {
    			System.out.println(Math.abs(list.get(0)-list2.get(0)));
    		}
    		else {
    			Collections.sort(list2);
    			System.out.println(Math.max(Math.abs(list.get(0)-list2.get(0)), (Math.abs(list.get(0)-list2.get(list2.size()-1)))));
    		}
    	}
    	else {
    		Collections.sort(list);
    		System.out.println(Math.abs(list.get(0)-list.get(list.size()-1)));
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