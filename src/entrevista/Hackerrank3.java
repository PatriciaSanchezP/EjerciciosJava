package entrevista;

import java.util.Scanner;

public class Hackerrank3 {
	
	static int B;
	static int H;
	
	static {
		Scanner sc = new Scanner(System.in);
		B = sc.nextInt();
		H = sc.nextInt();
		if (B<=0 || H<=0) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		System.exit(0);
		}
		sc.close();
	}

	public static void main(String[] args) {
		int area = B*H;
		System.out.println(area);

	}

}
