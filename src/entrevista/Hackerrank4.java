package entrevista;

import java.util.Calendar;


public class Hackerrank4 {
	public static void main(String[] args) {
		Calendar calendario = Calendar.getInstance();
		calendario.set(2023, 7, 16);
		int dayOfWeek = calendario.get(Calendar.DAY_OF_WEEK);
		switch(dayOfWeek) {
		case 1:
			System.out.println("SUNDAY");
			break;
		case 2:
			System.out.println("MONDAY");
			break;
		case 3:
			System.out.println("TUESDAY");
			break;
		case 4:
			System.out.println("WEDNESDAY");
			break;
		case 5:
			System.out.println("THURSDAY");
			break;
		case 6:
			System.out.println("FRIDAY");
			break;
		case 7:
			System.out.println("SATURDAY");
			break;
		}
		 
	}

}
