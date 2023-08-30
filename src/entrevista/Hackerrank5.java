package entrevista;

public class Hackerrank5 {
	public static void main(String[] args) {
		String s = "11:00:01PM";
		String [] st = s.split(":");
		String hour = st[0];
		String min = st[1];
		String seconds = st[2];
		String sec = seconds.substring(0, 2);
		String ampm = seconds.substring(2);
		System.out.println(ampm);
		if(ampm.equals("AM")) {
			if(hour.equals("12")) {
				hour="00";
			}
		String format24 = hour + ":" + min + ":"+ sec;
		
		System.out.println(format24);
		} else {
			int hournum = Integer.parseInt(hour);
			if(hournum==12) {
				hournum=12;
			} else {
			hournum+=12;
			} 
		String format24 =  hournum + ":" + min + ":"+ sec;
		System.out.println(format24);
		}
		
	}

}
