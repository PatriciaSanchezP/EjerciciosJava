package entrevista;

import java.util.Scanner;

public class Hackerrank8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		String B = sc.nextLine();
		sc.close();
		
		System.out.println(A.length() + B.length());
		
		if(A.compareTo(B)>0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		String capitalized = A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1);
		System.out.println(capitalized);
        

	}

}
