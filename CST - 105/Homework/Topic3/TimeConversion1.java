package TimeConversions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion1 {

	public static void main(String[] args) throws ParseException 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the time which you wish to convert: ");
		String time1 = input.next();
		input.close();
		try {       
	           SimpleDateFormat _24HourSDF = new SimpleDateFormat("HH:mm");
	           SimpleDateFormat _12HourSDF = new SimpleDateFormat("hh:mm a");
	           Date _24HourDt = _24HourSDF.parse(time1);
	           System.out.println(_12HourSDF.format(_24HourDt));
	       } catch (Exception e) {
	           e.printStackTrace();
	       }
	}

}
