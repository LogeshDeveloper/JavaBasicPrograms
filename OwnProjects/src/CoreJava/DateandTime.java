package CoreJava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateandTime {

	public static void main(String[] args) {
	
	DateFormat date = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
	Date dateobj = new Date();
	System.out.println(date.format(dateobj));
		
		
	}

}
