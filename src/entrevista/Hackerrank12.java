package entrevista;

import java.util.Scanner;

public class Hackerrank12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine();
		sc.close();
		String [] tokens = s.split("[//!?._//'@, ]");
		
		int newLength = 0;
		for(String token:tokens) {
			if(token.isEmpty()) {
				continue;
			} else {
				newLength ++;
			}
		}
		
		System.out.println(newLength);
		
		for(String token:tokens) {
			if(token.isEmpty()) {
				continue;
			} else {
				System.out.println(token);
			}
		}
		


	}

}
