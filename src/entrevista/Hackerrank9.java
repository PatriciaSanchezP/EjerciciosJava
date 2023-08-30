package entrevista;

import java.util.Scanner;

public class Hackerrank9 {
	

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for(int i = 1; i<=s.length()-k; i++) {
        	String iterable = s.substring(i, i+k);
        	if(iterable.compareTo(smallest)<0) {
        		smallest=iterable;
        	} 
        	
        	if(iterable.compareTo(largest)>0) {
        		largest=iterable;
        	}
        	
        }
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner scan = new Scanner(System.in);
	      String s = scan.next();
	      int k = scan.nextInt();
	      scan.close();
	      	System.out.println(getSmallestAndLargest(s, k));
	}

}
