package entrevista;

import java.util.Scanner;

public class Hackerrank2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		sc.close();
		if(n>=-100 && n<= 100) {
			String s = Integer.toString(n);
			if (s instanceof String) {
				System.out.println("Good job");
			} else {
				System.out.println("Wrong answer");
			}
			
		} else {
			System.out.println("Wrong input");
		}

		

	}

}
