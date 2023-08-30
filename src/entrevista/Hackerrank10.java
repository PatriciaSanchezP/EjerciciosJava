package entrevista;

import java.util.Scanner;

public class Hackerrank10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String A=sc.next().toLowerCase();
        sc.close();
        StringBuffer reverse = new StringBuffer(A).reverse();
        /* Enter your code here. Print output to STDOUT. */
        if(A.equals(reverse.toString())) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }

	}
}
