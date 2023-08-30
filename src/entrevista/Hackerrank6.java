package entrevista;
import java.util.Scanner; 

public class Hackerrank6 {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        String s;
		        int num;
System.out.println("================================");

		        for(int x = 1; x <= 3; x++) {

		            s = scanner.next();
		            num = scanner.nextInt();

		            System.out.printf("%-15s%03d%n",s,num);
		        }
		        System.out.println("================================");
scanner.close();		    }

}
